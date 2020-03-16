package com.github.barismeral.dovizAPI;

/**
 * @author Barış Meral
 * @see java.lang.Enum
 * @since 12.15.2018
 * @version 1.0.1
 *
 * <code>com.github.barismeral.dovizAPI.Moneys</code>
 *
 *
 *
 */

public enum Moneys {

    US_DOLLAR(0),
    AUSTRALIAN_DOLLAR(1),
    DANISH_KRONE(2),
    EURO(3),
    POUND_STERLING(4),
    SWISS_FRANK(5),
    SWEDISH_KRONA(6),
    CANADIAN_DOLLAR(7),
    KUWAITI_DINAR(8),
    NORWEGIAN_KRONE(9),
    SAUDI_RIYAL(10),
    JAPANESE_YEN(11),
    BULGARIAN_LEV(12),
    NEW_LEU(13),
    RUSSIAN_ROUBLE(14),
    IRANIAN_RIAL(15),
    CHINESE_RENMINBI(16),
    PAKISTANI_RUPEE(17),
    QATARI_RIAL(18);


    int value;
    private Moneys(int i){

        value = i;

    }


}
