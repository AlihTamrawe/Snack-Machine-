package Models.com;

import java.lang.ProcessBuilder.Redirect.Type;

public class Coins extends Payment {
     public Coins(double value, String symbol) {
     super(value, symbol, symbol);
    }
    private String symbol ;
    @Override
    public void withdraw(double val) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void depsite(double val) {
        // TODO Auto-generated method stub
        
    }

    
}
