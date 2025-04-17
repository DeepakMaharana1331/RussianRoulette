import java.sql.SQLOutput;
import java.util.Scanner;

public class advanced {


    public String name ="";
    public int Score,nationality;
    boolean playerDodge = false;
    boolean playerpeek = false;
    public int dodgestack=1;
    public int russiandodgestack=2;
    music musi = new music();

    Scanner sc =new Scanner(System.in);

    random advg =new random();




    public advanced(String name, int nationality){
        this.name= name;
        this.nationality=nationality;


    }

    public void RDodge(String str){


        if(russiandodgestack>0) {


            if (str.equalsIgnoreCase("dodge")) {
                playerDodge = true;
                musi.dash();
                russiandodgestack--;

            } else if (str.equalsIgnoreCase("face")) {
                playerDodge = false;
            }

        }
        else{
            System.out.println("you have used all your dodges");
            System.out.println("you cant Dodge anymore");
            playerDodge=false;
        }

    }


    public void Dodge(String str){


        if(dodgestack>0) {


            if (str.equalsIgnoreCase("dodge")) {
                playerDodge = true;
                musi.dash();
                dodgestack--;

            } else if (str.equalsIgnoreCase("face")) {
                playerDodge = false;
            }

        }
        else{
            System.out.println(" you have used all your dodges");
            System.out.println("You cant Dodge anymore ");
            playerDodge=false;
        }

    }


 public void checkdodgeablity(advanced A1){
        Scanner scan = new Scanner(System.in);
        String strr="";

        if(A1.nationality==2){
            System.out.println("Do "+A1.name+" want to dodge this round ");
            System.out.println(A1.name+" you have "+russiandodgestack+" Dodges left ");
            System.out.println("type dodge or face ");
            strr=scan.nextLine();
            RDodge(strr);
        }
        else{
            System.out.println("Do "+A1.name+" want to dodge this round ");
            System.out.println(A1.name+" you have "+ A1.dodgestack+" Dodges left");
            System.out.println("type dodge or face ");
            strr=scan.nextLine();
            Dodge(strr);
        }
 }
























    public void playadvance(){


        Scanner scanner = new Scanner(System.in);
        int choice;



        System.out.println(" To play Advanced single Player Press 4 or to play Advanced double player press 5");
        choice= scanner.nextInt();
        if(choice==4){
            System.out.println("Sign Here ");
            scanner.nextLine();
            String aname= scanner.nextLine();
            System.out.println("Enter your country \n1.America \n2.Russia \n3.China \n4.India");
            int anation= scanner.nextInt();
            advanced A1 = new advanced(aname,anation);
            advgame play = new advgame();
            play.advplaysingle(A1);

        }
        else if(choice==5){
            System.out.println("you have choosed to play advanced double player");
            System.out.println("Sign Here Player 1");
            scanner.nextLine();
            String aname1 = scanner.nextLine();
            System.out.println("Sign here player 2");
            String aname2 = scanner.nextLine();

            System.out.println("Enter your country "+aname1+ "\n1.America \n2.Russia \n3.China \n4.India");
            int anation1= scanner.nextInt();
            advanced A1 = new advanced(aname1,anation1);
            System.out.println("Enter your country "+aname2+ "\n1.America \n2.Russia \n3.China \n4.India");
            int anation2= scanner.nextInt();
            advanced A2 = new advanced(aname2,anation2);

            advgame play = new advgame();
            play.advplaydouble(A1,A2);
        }


    }

}
