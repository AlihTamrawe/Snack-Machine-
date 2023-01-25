package Models.com;

import java.lang.ProcessBuilder.Redirect.Type;

public class Coins extends Payment {
     public Coins(double value, String symbol) {
     super(value, symbol, symbol);
    }
     @Override
    public void withdraw(double val) {

    	 if(this.getBalance() == val) {
    		 System.out.println("Valid Money inserted ");
    	 }else  if(this.getBalance()> val) {
    		 System.out.println("Unvalid Money inserted , please insert big Coins");
    	 }else {
    		 
    	 }
    }
    @Override
    public void depsite(double val) {
        
    }
	

    
}
