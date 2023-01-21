package Models;
public class Notes extends Payment {

    public Notes(double balance, String carrancy, String type) {
        super(balance, carrancy, type="" != null? "Notes":type );
        //TODO Auto-generated constructor stub
    }

    public Notes( ) {
        super(0.0, "Dollar", "Notes");
        //TODO Auto-generated constructor stub
    }
    @Override
    public void withdraw(double val) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void depsite(double val) {
        // TODO Auto-generated method stub
        
    }
    
}
