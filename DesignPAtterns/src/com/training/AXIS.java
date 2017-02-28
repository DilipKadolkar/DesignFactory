package com.training;

import com.training.interfaces.Bank;

public class AXIS implements Bank{  
    private final String BNAME;  
    public AXIS(){  
           BNAME="AXIS BANK";  
   }  
   public String getBankName() {  
             return BNAME;  
   }  
}  
