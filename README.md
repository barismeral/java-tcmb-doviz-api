# TCBM java API

## Version 1.0.1

## Factory Class CurrencyFactory

## Moneys Enum Moneys

## Currency Interface Currency

## Main Class Main

<hr>

# Methods
<hr>

<code>getCurrency();        //return Money name, selling price, buying price and date</code>

## Usage
<hr>
<code> CurrencyFactory factory = new CurrencyFactory(Moneys.US_DOLLAR); 
  
  Currency cur = factory.getCurrency();     // get selected money unit current infos
  
  String date = cur.getDate();     // 12/14/2018
  
  String name = cur.getName();    // US DOLLAR
  
  float buying = cur.getBuyingPrice();   // 5.3672
  
  float selling = cur.getSellingPrice();   // 5.3887
  
  boolean isForex = cur.isForex();   // false dollar not forex</code>
  <hr>
  
            
