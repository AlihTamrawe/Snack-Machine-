package Models.com;

public abstract class Payment {
    private double balance;
    private String Carrancy;
    private String type; 


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCarrancy() {
        return Carrancy;
    }

    public void setCarrancy(String carrancy) {
        Carrancy = carrancy;
    }


    

    public Payment(double balance, String carrancy, String type) {
        this.balance = balance;
        Carrancy = carrancy;
        this.type = type;
    }

    // abstract Method for withdraw 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

        // abstract Method
    abstract public void withdraw(double val);

    // abstract Method
    abstract public void  depsite(double val);
}
