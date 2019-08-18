package com.github.barismeral.xml.foreignexance;


/**
 * @author Barış Meral
 * @since 15.12.2018
 * @version 1.0.1
 *
 *
 * Test Main class
 *
 *
 */

public class Main {

    public static void main(String[] args) {

        CurrencyFactory currencyAPI = new CurrencyFactory(Moneys.US_DOLLAR);
         
        Currency cur = currencyAPI.getCurrency();

        //get Date MM/DD/YY
        System.out.println(cur.getDate());

        //get Money Name
        System.out.println(cur.getName());

        //get Buying Price
        System.out.println(cur.getBuyingPrice());

        //get Selling Price
        System.out.println(cur.getSellingPrice());

        //get is forex
        System.out.println(cur.isForex());


        /*
         *   ----output----
         *
         *     12/14/2018
         *     US DOLLAR
         *      5.3672
         *      5.3887
         *      false
         *   -------------
         */


    }
}
