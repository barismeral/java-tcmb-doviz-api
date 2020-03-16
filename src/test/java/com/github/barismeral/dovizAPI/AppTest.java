package com.github.barismeral.dovizAPI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {



    @Test
     public void printCurrencyName(){

        CurrencyFactory currencyFactory = new CurrencyFactory(Moneys.US_DOLLAR);
        Currency currency = currencyFactory.getCurrency();
        assertEquals("US DOLLAR",currency.getName(),"USD");

    }







}