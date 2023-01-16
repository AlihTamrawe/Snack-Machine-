public class Snacks {
    private String name;
    private String keysymbol;
    private int quantity;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Snacks(String name, String keysymbol) {
        this.name = name;
        this.keysymbol = keysymbol;
        this.quantity = 0;
        this.price = 0.0;
    }

    public Snacks(){
        this.name = " ";
        this.keysymbol = "null";
        this.quantity = 0;
    }

    public Snacks(String name, String keysymbol, int quantity,double price) {
        this.name = name;
        this.keysymbol = keysymbol;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setKeysymbol(String keysymbol) {
        this.keysymbol = keysymbol;
    }
    public String getKeysymbol() {
        return keysymbol;
    }
}
