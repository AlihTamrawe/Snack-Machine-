package Factory;

import java.util.List; /** * Decleare public API for Vending Machine * @author Javin Paul */ 
public interface VendingMachine {
 	public void checkbalance( ); 
 	public double pickItem(String keybad,double money); 
 	
}

 