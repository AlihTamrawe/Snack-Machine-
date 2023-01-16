import java.util.HashMap;
import java.util.*;

public class TestMachine {
    

    public static void main(String[] args) {

        Cards c1 = new Cards(50);
        Snacksmachine mach1;
        Snacks sn1 = new Snacks("Cheetos","1A",2,0.20);
        Snacks sn2 = new Snacks("Dertos","15A",15,0.50);

        Snacks sn3 = new Snacks("Meetos","20A",15,0.75);

        Snacks sn4 = new Snacks("Snikars","1C",15,0.75);

        Snacks sn5 = new Snacks("BONPON","7C",15,1);

        Snacks sn6 = new Snacks("Raphilo","90C",15,1);

        Snacks sn7 = new Snacks("Galaxy","2D",15,0.50);


        Snacks sn8 = new Snacks("NumperOne","8D",15,0.75);
        HashMap<String,Snacks> snacks=new HashMap<String, Snacks>();
        snacks.put(sn1.getKeysymbol(), sn1);
        snacks.put(sn2.getKeysymbol(), sn2);
        snacks.put(sn3.getKeysymbol(), sn3);
        snacks.put(sn4.getKeysymbol(), sn4);
        snacks.put(sn5.getKeysymbol(), sn5);
        snacks.put(sn6.getKeysymbol(), sn6);
        snacks.put(sn7.getKeysymbol(), sn7);
        snacks.put(sn8.getKeysymbol(), sn8);


        mach1 = new Snacksmachine(snacks,50);
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to Snacks Machine in Palestine Jenin how Can I Serve You Sir ?");

        System.out.println("press any thing  to cont.");
        String check =sc.nextLine();
        double money = 0.0
        
        ;
        while(check!=""){

            for( Snacks in :snacks.values()){
                System.out.println( in.getName()+" for   "+in.getPrice()+ "  , "+in.getKeysymbol());
            }
            System.out.println("Pick one  as Symbol using keypad");
            String keypad = sc.nextLine();
            System.out.println("Card press c or  Coins press any thing   ");

            check =sc.nextLine().toString();
            System.out.println(check);
            if(snacks.get(keypad)!=null){
            if(check.equals("c" )){
                c1.withdrawbalance(snacks.get(keypad).getPrice());

                 if(mach1.pickSnacks(keypad,snacks.get(keypad).getPrice())==-1){
                c1.depositebalance(snacks.get(keypad).getPrice());
                }

            }else{

            System.out.println("insert Money: ");
            try{
              money = Double.parseDouble(sc.nextLine());
              mach1.pickSnacks(keypad,money);

        }catch(Exception e){

        }
            
                }
    }else{
        System.out.println("You entered out of Range Keypad try again ");

    }
    System.out.print("if u wanna chech Machine balance press password: ");

    check =sc.nextLine().toString();
    if(check.equals("111"))
    {
        System.out.println("Balance :"+mach1.getBalance());
    }


            System.out.println("to cont. press yes");
            check =sc.nextLine();
            System.out.println(check);
        }



    }
}
