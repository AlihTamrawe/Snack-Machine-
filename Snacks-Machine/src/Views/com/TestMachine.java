package Views.com;

 
import java.util.HashMap;
import java.util.Scanner;
import Models.com.*;
 
import Controller.com.*;;

public class TestMachine {
    

    public static void main(String[] args) {
        //declare Machine
        Payment Card1 = new Cards() ;
        Snacksmachine mach1;


        Snacks sn1 = new Snacks("Cheetos","1A",2,0.20);
        Snacks sn2 = new Snacks("Dertos","5A",15,0.50);

        Snacks sn3 = new Snacks("Meetos","10A",15,0.75);

        Snacks sn4 = new Snacks("Snikars","15A",15,0.75);

        Snacks sn5 = new Snacks("BONPON","20A",15,1);

        Snacks sn6 = new Snacks("Raphilo","1C",15,1);

        Snacks sn7 = new Snacks("Galaxy","2C",15,0.50);


        Snacks sn8 = new Snacks("NumperOne","4C",15,0.75);
        Snacks sn9 = new Snacks("today","12C",15,0.75);

        Snacks sn10 = new Snacks("freeze","24C",15,0.75);
        Snacks sn11 = new Snacks("bial","1D",2,0.20);
        Snacks sn12 = new Snacks("goss","5D",15,0.50);

        Snacks sn13 = new Snacks("situy","10D",15,0.75);

        Snacks sn14 = new Snacks("valhals","18D",15,0.75);

        Snacks sn15 = new Snacks("shocko","29D",15,1);

        Snacks sn16 = new Snacks("dorliana","6F",15,25);

        Snacks sn17 = new Snacks("hamama","9F",15,0.25);


        Snacks sn18 = new Snacks("filssq","15F",15,0.75);
        Snacks sn19 = new Snacks("halpino","17F",15,0.75);

        Snacks sn20 = new Snacks("futaaq","21F",15,0.75);
        Snacks sn21 = new Snacks("ytus","1G",2,0.20);
        Snacks sn22 = new Snacks("moplik","5G",15,0.50);

        Snacks sn23 = new Snacks("goills","16G",15,0.65);

        Snacks sn24 = new Snacks("doooa","23G",15,0.95);

        Snacks sn25 = new Snacks("noew","30G",15,1.20);

        HashMap<String,Snacks> snacks=new HashMap<String, Snacks>();
        snacks.put(sn1.getKeysymbol(), sn1);
        snacks.put(sn2.getKeysymbol(), sn2);
        snacks.put(sn3.getKeysymbol(), sn3);
        snacks.put(sn4.getKeysymbol(), sn4);
        snacks.put(sn5.getKeysymbol(), sn5);
        snacks.put(sn6.getKeysymbol(), sn6);
        snacks.put(sn7.getKeysymbol(), sn7);
        snacks.put(sn8.getKeysymbol(), sn8);
        snacks.put(sn9.getKeysymbol(), sn9);
        snacks.put(sn10.getKeysymbol(), sn10);
        snacks.put(sn11.getKeysymbol(), sn11);
        snacks.put(sn12.getKeysymbol(), sn12);
        snacks.put(sn13.getKeysymbol(), sn13);
        snacks.put(sn14.getKeysymbol(), sn14);
        snacks.put(sn15.getKeysymbol(), sn15);
        snacks.put(sn16.getKeysymbol(), sn16);
        snacks.put(sn17.getKeysymbol(), sn17);
        snacks.put(sn18.getKeysymbol(), sn18);
        snacks.put(sn19.getKeysymbol(), sn19);
        snacks.put(sn20.getKeysymbol(), sn20);
        snacks.put(sn21.getKeysymbol(), sn21);
        snacks.put(sn22.getKeysymbol(), sn22);
        snacks.put(sn23.getKeysymbol(), sn23);
        snacks.put(sn24.getKeysymbol(), sn24);
        snacks.put(sn25.getKeysymbol(), sn25);


        mach1 = new Snacksmachine(snacks,50);
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to Snacks Machine in Palestine Jenin how Can I Serve You Sir ?");

        System.out.println("press any thing  to cont.");
        String check =sc.nextLine();
        double money = 0.0
        
        ;
        while(check!=""){
            int prevs=0;
            for( Snacks in :snacks.values()){
                System.out.print( in.getName()+" for   "+in.getPrice()+ "  , "+in.getKeysymbol() +"");
                if(prevs%5==0){
                    System.out.println();
                }
                  prevs++;
            }
            System.out.println();

            System.out.println("Pick one  as Symbol using keypad");
            String keypad = sc.nextLine();
            System.out.println("Card press c or  Coins press any thing   ");

            check =sc.nextLine().toString();
            System.out.println(check);
            if(snacks.get(keypad)!=null){
            if(check.equals("c" )){
                Card1.withdraw(snacks.get(keypad).getPrice());

                 if(mach1.pickSnacks(keypad,snacks.get(keypad).getPrice())==-1){
                 Card1.depsite(snacks.get(keypad).getPrice());
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
