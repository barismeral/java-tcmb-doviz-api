package com.github.barismeral.dovizAPI;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import java.net.URL;

/**
 * @author Barış Meral
 * @since 12.15.2018
 * @version 1.0.1
 * <code>com.github.barismeral.dovizAPI.CurrencyFactory</code> class
 * <p>xml parser class</p>
 */



public final class CurrencyFactory {


    private Moneys money;
    private String currencyName;
    private float currencySellingPrice;
    private float currencyBuyingPrice;
    private boolean isForex;

    private String date;

    /**
     * private Constructor no access
     */
    private CurrencyFactory(){ }

    /**
     *
     * @param money Enum com.github.barismeral.dovizAPI.Moneys
     */
    public CurrencyFactory(Moneys money){

        this.money = money;

        parse();

    }


    /**
     *  set default money name
     * @param money Enum com.github.barismeral.dovizAPI.Moneys
     */
    public void setCurrencies(Moneys money){

        this.money = money;
        parse();
    }

    /**
     * <p>return com.github.barismeral.dovizAPI.Currency interface for selected money name, buying and selling price</p>
     * @return com.github.barismeral.dovizAPI.Currency
     */
    public Currency getCurrency(){


        return new Currency() {
            @Override
            public String getDate() {
                return date;
            }

            @Override
            public String getName() {
                return currencyName;
            }

            @Override
            public float getBuyingPrice() {
               return currencyBuyingPrice;
            }

            @Override
            public float getSellingPrice() {
                return currencySellingPrice;
            }

            @Override
            public boolean isForex(){return isForex;}
        };

    }



    private void parse(){

        try {


        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

            Document document = builder.parse(new  URL("https://www.tcmb.gov.tr/kurlar/today.xml").openStream());

            date = document.getDocumentElement().getAttribute("Date");

            NodeList nodeList = document.getDocumentElement().getElementsByTagName("Currency");

            Node node = nodeList.item(money.value);

            if (node.getNodeType() == Node.ELEMENT_NODE){

                Element element = (Element) node;

                currencyName = element.getElementsByTagName("CurrencyName").item(0).getTextContent();


                // money index > 12 is forex
                if (money.value>12){

                    currencyBuyingPrice = Float.parseFloat(element.getElementsByTagName("ForexBuying").item(0).getTextContent());
                    currencySellingPrice = Float.parseFloat(element.getElementsByTagName("ForexSelling").item(0).getTextContent());
                    isForex=true;
                }

                // money index < 12 is normal
                else {

                    currencyBuyingPrice = Float.parseFloat(element.getElementsByTagName("BanknoteBuying").item(0).getTextContent());
                    currencySellingPrice = Float.parseFloat(element.getElementsByTagName("BanknoteSelling").item(0).getTextContent());
                    isForex =false;
                }


            }



}  //Exceptions
        catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }


    }


}