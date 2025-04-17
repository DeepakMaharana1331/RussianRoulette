
import java.util.Random;
import java.util.Scanner;

public class advgame {
    music musi = new music();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public static int peekstack=1;
    public static int indianpeekstack=2;



    static int i;

    int newbullet ;





    public void advplaysingle(advanced A1) {



        int i;



        int compScore = 0;
        int choice = 3;
        int computerDodgeStack =1;

        boolean computerDodge = false;


        System.out.println(" Welcome to advanced russian Roulette ");

        System.out.println(" If you want to Fire First then 1 or to let computer fire first then 2");
        int first = scanner.nextInt();

        int bullet = random.nextInt(6) + 1;


        for ( i = 1; i < 7; i++) {

            System.out.println("bullet on "+bullet);




            if(i==1){
                System.out.println(i+"st shell :");

            }
            else if(i==2){
                System.out.println("Revolving to "+i+"nd shell: ");
            }
            else if(i==3){
                System.out.println("Revolving to "+i+"rd shell: ");
            }
            else if(i<=4){
                System.out.println("Revolving to "+i+"th shell: ");
            }

            musi.guncock1();


            if (first == 1) {
                if (i % 2 != 0) {
                    System.out.println("computer turn to shoot");

                    System.out.println("if " + A1.name + " wants to Dodge this round");
                    A1.checkdodgeablity(A1);



                } else {
                    System.out.println(A1.name+"'s Turn to Shoot ");
                    System.out.println("if computer wants to dodge then he can");
                    scanner.nextInt();


                    if(computerDodgeStack>0){
                        computerDodge = random.nextBoolean();
                        computerDodgeStack--;


                    }
                    else{
                        computerDodge=false;
                    }
                }
            } else {

                if (i % 2 == 0) {
                    System.out.println("computer turn ");
                    System.out.println("To Shoot ");
                    System.out.println("if " + A1.name + " wants to Dodge this round");
                    A1.checkdodgeablity(A1);


                } else {
                    System.out.println(A1.name+"'s Turn to Shoot ");
                        System.out.println("computer can dodge");

                        scanner.nextInt();
                    if(computerDodgeStack>0){

                        computerDodge = random.nextBoolean();
                        computerDodgeStack--;



                    }
                    else{

                        computerDodge=false;
                    }






                }}

            if (bullet == i) {
                    if (first == 1) {
                        if (i % 2 != 0) {
                            if (A1.playerDodge == true) {
                                System.out.println("Boom!!! the bullet was here ");
                                musi.gunshot();
                                System.out.println(A1.name+" Dodged it");
                                return;



                            } else {
                                System.out.println("Boom!!! the bullet was in "+i+" Shell ");
                                musi.gunshot();
                                System.out.println(A1.name+" Was shot to dead ");
                                musi.palyerdeath();

                                return;



                            }


                        } else {
                            if (computerDodge == true) {
                                System.out.println("Boom!!! the bullet was here ");
                                musi.gunshot();
                                System.out.println("Comp  Dodged it ");


                            } else {
                                System.out.println("Boom!!! the bullet was here ");
                                musi.gunshot();
                                System.out.println("computer was shot");
                                musi.compdeath();
                                return;

                            }

                        }

                    }


                }
            else {
                    System.out.println("the " + (i+1)+ "Shell was Empty");
                    musi.empty();

                    if(first==1){
                        if(i%2!=0) {


                            if(A1.playerDodge==true){
                            System.out.println(A1.name+" dodged");}
                            else{
                                System.out.println(A1.name+" did not flinch");
                            }
                        }
                        else {


                                if(computerDodge==true){
                                    System.out.println("computer dodged");}
                                else{
                                    System.out.println( " Computer did not flinch");
                                }

                        }
                    }else {
                        if (i % 2 == 0) {


                            if (A1.playerDodge == true) {
                                System.out.println(A1.name+" dodged");
                            } else {
                                System.out.println(A1.name + " did not flinched");
                            }
                        } else {


                            if (computerDodge == true) {
                                System.out.println("computer dodged");
                            } else {
                                System.out.println(" Computer did not flinched");
                            }

                        }
                    }
                }



        }

    }


    public int advplaydouble(advanced A1,advanced A2) {
        String charv;





          int compScore = 0;
          int choice = 3;
          int computerDodgeStack = 1;


          boolean computerDodge = false;


          System.out.println(" Welcome to advanced russian Roulette ");


          System.out.println("If " + A1.name + " wants to fire first the press 1 or press 2 if " + A2.name + " wants to play Firt ");
          int first = scanner.nextInt();


          for (i = 0; i <=6; i++) {
              int bullet = random.nextInt(6) + 1;



              if (i == 1) {
                  System.out.println((i + 1) + "st shell :");

              } else if (i == 2) {
                  System.out.println("Revolving to " + i + "nd shell: ");
              } else if (i == 3) {
                  System.out.println("Revolving to " + i + "rd shell: ");
              } else if (i <= 4) {
                  System.out.println("Revolving to " + i + "th shell: ");
              }

              musi.guncock1();


              if (first == 1) {
                  if (i % 2 != 0) {
                      System.out.println(A2.name + "'s turn to shoot");


                      A1.checkdodgeablity(A1);


                  } else {
                      System.out.println(A1.name + "'s Turn to Shoot ");

                      A2.checkdodgeablity(A2);


                  }
              } else {

                  if (i % 2 == 0) {
                      System.out.println(A1.name + "'s Turn to Shoot ");


                      A2.checkdodgeablity(A2);


                  } else {
                      System.out.println(A2.name + "'s turn to shoot");


                      A1.checkdodgeablity(A1);
                  }


              }

              if (bullet == i) {
                  if (first == 1) {
                      if (i % 2 != 0) {
                          if (A1.playerDodge == true) {
                              System.out.println("Boom!!! the bullet was in " + (i + 1) + " shell ");
                              musi.gunshot();
                              System.out.println(A1.name + " Dodged it");
                              A1.Score=+50;
                              musi.dash();


                          } else {
                              System.out.println("Boom!!! the bullet was in " + (i + 1) + " Shell ");
                              musi.gunshot();
                              System.out.println(A1.name + " Was shot to dead ");
                              A2.Score=+100;
                              musi.palyerdeath();

                            break;


                          }


                      } else {
                          if (A2.playerDodge == true) {
                              System.out.println("Boom!!! the bullet was here ");
                              musi.gunshot();
                              System.out.println(A2.name + " Dodged it");
                              A2.Score=+50;
                              musi.dash();


                          } else {
                              System.out.println("Boom!!! the bullet was in " + i + " Shell ");
                              musi.gunshot();
                              System.out.println(A2.name + " Was shot to dead ");
                              A1.Score=+50;
                              musi.palyerdeath();

                             break;

                          }

                      }

                  }


              } else {
                  System.out.println("the " + (i + 1) + "Shell was Empty");
                  musi.empty();

                  if (first == 1) {
                      if (i % 2 != 0) {


                          if (A1.playerDodge == true) {
                              System.out.println(A1.name + " dodged");
                          } else {
                              System.out.println(A1.name + " did not flinch");
                          }
                      } else {


                          if (A2.playerDodge == true) {
                              System.out.println(A2.name + " dodged");
                          } else {
                              System.out.println(A2.name + " did not flinch");
                          }

                      }
                  } else {
                      if (i % 2 == 0) {


                          if (A1.playerDodge == true) {
                              System.out.println(A1.name + " dodged");
                          } else {
                              System.out.println(A1.name + " did not flinched");
                          }
                      } else {


                          if (A2.playerDodge == true) {
                              System.out.println(A2.name + " dodged");
                          } else {
                              System.out.println(A2.name + " did not flinched");
                          }

                      }
                  }
              }


          }



        System.out.println("\n" + A1.name + " has " + A1.Score+ " score ");
        System.out.println("\n" + A2.name+ " has " + A2.Score + " score ");
        if(A1.Score>A2.Score){
            System.out.println(A1.name+" \nSaved the world");
            if(A1.nationality==1){
                System.out.println("America won ");
                musi.americanbgm();
            }
            else if(A1.nationality==2){
                System.out.println("Russia won ");
                musi.russianbgm();
            }
            else if(A1.nationality==3){
                System.out.println("China won");
                musi.chinesebgm();
            }
            else if(A1.nationality==4){
                System.out.println("India won");
                musi.indianbgm();
            }



        }
        else if (A1.Score<A2.Score) {
            System.out.println(A2.name+" saved the world");
            if(A2.nationality==1){
                System.out.println("America won ");
                musi.americanbgm();
            }
            else if(A2.nationality==2){
                System.out.println("Russia won ");
                musi.russianbgm();
            }
            else if(A2.nationality==3){
                System.out.println("China won");
                musi.chinesebgm();
            }
            else if(A2.nationality==4){
                System.out.println("India won");
                musi.indianbgm();
            }


        }
        else if(A1.Score==A2.Score){
            System.out.println("no body won");
        }

        return 0;
    }
}

