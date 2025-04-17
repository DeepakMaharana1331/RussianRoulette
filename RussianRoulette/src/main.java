//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class main{
    static int compScore = 0;
    static int userScore = 0;
    static int country1,country2;
    static int mode;
    public static music musi = new music();
    public static txt tx = new txt();

    public static void main(String[] args) {


        int input;
        String name;
        do {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();


            musi.welcomebgm();
            if (musi.con == 3) {
                tx.history();

                break;
            }
            else if (musi.con == 4) {
                tx.rule();
                break;
            }
            else if (musi.con == 5) {
                tx.advancedrules();
                break;
            }
            else if (musi.con == 6) {
                System.out.println(" Quitting ");
                break;
            }
            System.out.println("To play single player, enter 1");
            System.out.println("To play double player, enter 2");
            System.out.println("To play  Advanced, enter 3  (Beta not fully functional )");
            input = scanner.nextInt();

            name = "";
            String name1 = "";
            String name2 = "";


            if (input == 1) {
                System.out.println("\nSign here to play");
                scanner.nextLine(); // Consume newline left-over
                name = scanner.nextLine();
                System.out.println("Get ready " + name + " ");
            } else if (input == 2) {

                System.out.println("First person to sign here");
                scanner.nextLine(); // Consume newline left-over
                name1 = scanner.nextLine();

                System.out.println("Second person to sign here");
                name2 = scanner.nextLine();

                System.out.println("Enter your country " + name1);
                System.out.println("1.America \n2.Russia \n3.China \n4.India");
                country1 = scanner.nextInt();

                System.out.println("Enter your country " + name2);
                System.out.println("1.America \n2.Russia \n3.China \n4.India");
                country2 = scanner.nextInt();

            } else if (input == 3) {

               advanced A3 = new advanced("sub",1);
               A3.playadvance();




            }


            if (input == 2) {
                playDoublePlayer(scanner, random, name1, name2);
            } else if (input == 1) {
                playSinglePlayer(scanner, random, name);
            }

    }while(mode==3);
    }

    private static void playDoublePlayer(Scanner scanner, Random random, String name1, String name2) {
        char ch;
        int score1 = 0;
        int score2 = 0;

        do {
            int bullet = random.nextInt(6) + 1;
            for (int i = 1; i < 7; i++) {
                if (i % 2 == 0) {

                    musi.guncock1();
                    System.out.println("\n" + name1 + " is aiming at " + name2 + " Hit 1 to fire: ");
                    scanner.nextInt();
                } else {
                    musi.guncock1();
                    System.out.println("\n" + name2 + " is aiming at " + name1 + " Hit 1 to fire: ");
                    scanner.nextInt();
                }
                if (i == bullet) {
                    musi.gunshot();
                    if(i==1){

                        System.out.println("\nBOOM! the bullet was in the " + i + "st chamber ");
                    }
                    else if(i==2){
                        System.out.println("\nBOOM! the bullet was in the " + i + "nd chamber ");

                    }
                    else if(i==3){
                        System.out.println("\nBOOM! the bullet was in the " + i + "rd chamber ");

                    }
                    else{
                        System.out.println("\nBOOM! the bullet was in the " + i + "th chamber ");

                    }
                    if (i % 2 == 0) {
                        System.out.println("\n" + name1 + " shooted " + name2 + "\n");
                        score1 += 100;

                    } else {
                        System.out.println("\n" + name2 + " shooted " + name1 + "\n");
                        score2 += 100;
                    }
                    break;
                } else {
                    musi.empty();
                    if(i==1){
                        try {
                            System.out.println("\nThe " + i + "st chamber was empty ");
                            Thread.sleep(10);
                            System.out.println("\nRevolving to " + (i + 1) + "nd chamber ");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else if(i==2){

                        try {
                            System.out.println("\nThe " + i + "nd chamber was empty ");
                            Thread.sleep(10);
                            System.out.println("\nRevolving to " + (i + 1) + "rd chamber ");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else if(i==3){
                        try {
                            System.out.println("\nThe " + i + "rd chamber was empty ");
                            Thread.sleep(10);
                            System.out.println("\nRevolving to " + (i + 1) + "th chamber ");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else{
                        try {
                            System.out.println("\nThe " + i + "th chamber was empty ");
                            Thread.sleep(10);
                            System.out.println("\nRevolving to " + (i + 1) + "th chamber ");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            System.out.println("Hit y to play again and n to see scores ");
            scanner.nextLine(); // Consume newline left-over
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'y');

        System.out.println("\n" + name1 + " has " + score1 + " score ");
        System.out.println("\n" + name2 + " has " + score2 + " score ");
        if(score1>score2){
            System.out.println(name1+" Saved the world");
            if(country1==1){
                System.out.println("America won ");
                musi.americanbgm();
            }
            else if(country1==2){
                System.out.println("Russia won ");
                musi.russianbgm();
            }
            else if(country1==3){
                System.out.println("China won");
                musi.chinesebgm();
            }
            else if(country1==4){
                System.out.println("India won");
                musi.indianbgm();
            }



        }
        else if (score1<score2) {
            System.out.println(name2+" saved the world");
            if(country2==1){
                System.out.println("America won ");
                musi.americanbgm();
            }
            else if(country2==2){
                System.out.println("Russia won ");
                musi.russianbgm();
            }
            else if(country2==3){
                System.out.println("China won");
                musi.chinesebgm();
            }
            else if(country2==4){
                System.out.println("India won");
                musi.indianbgm();
            }


        }
        else if(score1==score2){
            System.out.println("no body won");
        }


    }

    private static void playSinglePlayer(Scanner scanner, Random random, String name) {
        char ch;

        do {
            int bullet = random.nextInt(6) + 1;
            for (int i = 1; i < 7; i++) {
                if (i % 2 == 0) {
                    musi.guncock1();
                    System.out.println("\n" + name + " is aiming at computer Hit 1 to fire: ");
                    scanner.nextInt();
                } else {
                    musi.guncock1();

                    System.out.println("\nComputer is aiming at you Hit 1 to face the revolver: ");
                    scanner.nextInt();
                }
                if (i == bullet) {
                    musi.gunshot();
                    if(i==1){

                        System.out.println("\nBOOM! the bullet was in the " + i + "st chamber ");
                    }
                    else if(i==2){
                        System.out.println("\nBOOM! the bullet was in the " + i + "nd chamber ");

                    }
                    else if(i==3){
                        System.out.println("\nBOOM! the bullet was in the " + i + "rd chamber ");

                    }
                    else{
                        System.out.println("\nBOOM! the bullet was in the " + i + "th chamber ");

                    }

                    if (i % 2 == 0) {

                        musi.compdeath();
                        System.out.println("\nComputer was shot dead ");
                        userScore += 100;
                    } else {
                        musi.palyerdeath();
                        System.out.println("\n" + name + " was shot dead ");
                        compScore += 100;
                    }
                    break;
                } else {
                    musi.empty();
                    if(i==1){
                        System.out.println("\nThe " + i + "st chamber was empty ");
                        System.out.println("\nRevolving to " + (i+1)+ "nd chamber ");



                    }
                    else if(i==2){
                        System.out.println("\nThe " + i + "nd chamber was empty ");
                        System.out.println("\nRevolving to " + (i+1) + "rd chamber  ");
                    }
                    else if(i==3){
                        System.out.println("\nThe " + i + "rd chamber was empty ");
                        System.out.println("\nRevolving to " + (i+1 )+ "th chamber  ");
                    }
                    else{
                        System.out.println("\nThe " + i + "th chamber was empty ");
                        System.out.println("\nRevolving to " + (i+1) + "th chamber  ");
                    }
                }
            }
            System.out.println("Hit y to play again with computer or n to view results");
            scanner.nextLine(); // Consume newline left-over
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'y');

        System.out.println("\n" + name + " has " + userScore + " score ");
        System.out.println("\nComputer has " + compScore + " score ");
        if(compScore>userScore){
            System.out.println("computer Doomed the world");
            musi.compbgm();
        }
        else if (userScore>compScore) {
            System.out.println(name+" saved the world");
            musi.herobgm();


        }

    }
    }



