package com.training;

import com.training.interfaces.Bank;

public abstract class AbstractFactory{  
    public abstract Bank getBank(String bank);  
    public abstract Loan getLoan(String loan);  
  }  