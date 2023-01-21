package Models;
public class Cards extends Payment {
 
    public Cards(double balance, String carrancy, String type) {
        super(balance, carrancy, type);
    }

    public Cards(){
        super( 0.0, "USD","Coin");
       
        

    }
     
   
 
    @Override
    public void withdraw(double val) {
        if( getBalance()-val>0.01){
            this.setBalance(getBalance()-val);
            System.out.print("withdraw successful from your following value :"+val+"$");
            System.out.println("your Balance "+this.getBalance());
        }
        else{
            System.out.print("withdraw failed Check your Balance please !");

        }

        
    }
    @Override
    public void depsite(double val) {
        setBalance(getBalance()+val);
        System.out.print("we Charge your Card Again !");
        
    }
    
}
