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

        //get Date MM/DD/YY
        System.out.println(currencyAPI.getCurrency().getDate());

        //get Money Name
        System.out.println(currencyAPI.getCurrency().getName());

        //get Buying Price
        System.out.println(currencyAPI.getCurrency().getBuyingPrice());

        //get Selling Price
        System.out.println(currencyAPI.getCurrency().getSellingPrice());

        //get is forex
        System.out.println(currencyAPI.getCurrency().isForex());


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
