public class Cards {
    private double balance;
    private String currency ;
    public Cards(){
        balance = 0.0;
        this.currency = "USD";

    }
    public Cards(double balance){
        this.balance = balance ;
        this.currency = "USD";

    }
    public void withdrawbalance(double val){
        if( this.balance-val>0.01){
            this.balance-=val;
            System.out.print("withdraw successful from your following value :"+val+"$");
            System.out.println("your Balance "+this.balance);
        }
        else{
            System.out.print("withdraw failed Check your Balance please !");

        }

    }
    public void depositebalance(double val){
        this.balance+=val;
        System.out.print("we Charge your Card Again !");

    }
    
}
