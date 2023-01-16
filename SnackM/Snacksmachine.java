import java.util.HashMap;
class Snacksmachine{
    private HashMap<String,Snacks> snacks;
    // private Snacks [] snacks;
    private double balance;


    public Snacksmachine(HashMap<String, Snacks> snacks, double balance) {
        this.snacks = snacks;
        this.balance = balance;
    }


    public Snacksmachine()
    {
        this.snacks=new HashMap<String, Snacks>();
    }


    public void checkbalance(){     
            System.out.println("Your Machine Balance :"+this.balance);
    }
    public double pickSnacks(String keybad,double money){

        if(this.snacks.get(keybad) ==null){
            System.out.println("You entered out of Range Keypad try again ");

            return -1;
        }
        Snacks snack= this.snacks.get(keybad);
        
        if(snack.getQuantity()>0)
        {

            // four cases 
            //the first have the money and return the Rest if exists 
            if(money>=snack.getPrice()){
               
                    if(balance>= money-snack.getPrice())
                    {
                        System.out.println("You have Remainder :"+(money-snack.getPrice()));
                        System.out.println("Ready?  You "+snack.getName()+"in Slot ");
                        System.out.println("Your are Welcome? Visit us again ");
                        snack.setQuantity(snack.getQuantity()-1);
                        this.balance+=snack.getPrice();
                        this.snacks.put(keybad, snack);
                        return money-snack.getPrice();
                    }
                    else{            //the second  have the exact money and return nothing
                        System.out.println("Ready?  You Snack in Slot ");
                        System.out.println("Your are Welcome. Visit us again ");
                        this.balance+=snack.getPrice();
                        this.snacks.put(keybad, snack);
                        snack.setQuantity(snack.getQuantity()-1);
                        return 0;
                    }
            }
            else{  //the third  have the insufficient money and return error
                System.out.println("Sorry insufficient Money ");
                System.out.println("the Money is back to you again ");
                System.out.println("Your are Welcome. Try again ");
                return -1;
            }
        }
        else{//the four no snack for that type left in  machine  and return error
            System.out.println("Sorry insufficient Amout of  "+snack.getName());
            System.out.println("the Money is back to you again ");
                System.out.println("Your are Welcome. Try another thing ");
                return -1;
        }

    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setSnacks(HashMap<String,Snacks> snacks) {
        this.snacks = snacks;
    }
    public void setSnack( Snacks snack , String keybad) {
        this.snacks.put(keybad, snack);
    }
    public double getBalance() {
        return balance;
    }
    public HashMap<String,Snacks> getSnacks() {
        return snacks;
    }



}