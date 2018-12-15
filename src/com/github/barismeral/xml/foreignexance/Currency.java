package com.github.barismeral.xml.foreignexance;

/**
 * @author Barış Meral
 * @since 12.15.2018
 * @version 1.0.1
 * <code>Currency</code> <b>Interface</b>
 * <p>get current Date, get Money Name, get Buying & Selling Price, is forex ?</p>
 */


public interface Currency {
    /**
     *
     * @return String current Date
     */
    String getDate();

    /**
     *
     * @return String Money Name
     */
    String getName();

    /**
     *
     * @return float Buying Price
     */
    float getBuyingPrice();

    /**
     *
     * @return float Selling Price
     */
    float getSellingPrice();

    /**
     *
     * @return boolean is Forex
     */
    boolean isForex();


}
