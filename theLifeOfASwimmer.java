import java.util.Scanner;
//Project
public class Main
{
  //I'm going to use these as obtainables so that you can access other areas
  boolean key1;
  boolean key2;
  boolean key3;
  String input;
  int in;
  String name = "";
  
  public static void main(String args[])
  {
    Scanner scan  = new Scanner (System.in);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("             The Life of a Swimmer");
    System.out.println(" ");
    System.out.println("       By Lucas Torgerson & Solomon Cheung");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println(" ");
    System.out.println("                Enter 'a' to start");
    input = scan.nextLine();
    if(input.equals("a"))
    {
      //Initiate game;
      start();
    }
    else //In case, they don't choose a to start.
    {
      while(!input.equals("a"))
      {
        System.out.println("                Enter 'a' to start");
        input = scan.nextLine();
      }
      //Initiate game;
      start();
    }
  }
  public static void start()
  {
    System.out.println("  ");
    System.out.print("Our story begins in Southern California, the swim capital of the world and an extraordinary place to begin our young swimmers's journey. ");
    System.out.println("Tell me, what is the name of this particular swimmer? "
    System.out.println("  ");
    System.out.println("His name is?");
    name = scan.nextLine();
    System.out.println("  ");
    System.out.println("Ah yes, " + name + " is going to be a wonderful swimmer.");
                       
    System.out.println("  ");
    System.out.println("It is your first day of swim team, and you go to talk to some of your new teammates. Who do you talk to?
    System.out.println("1 - The captain of the team");
    System.out.println("2 - The casual swimmers");
    System.out.println("3 - The competitive athletes");
    
    in = scan.nextInt();
    //Pathways
    if(in == 1)
    {
      System.out.println("The captain has been chosen");
    }
    else if(in == 2)
    {
      System.out.println("The casual swimmers have been chosen");
    }
    else if(in == 3)
    {
      System.out.println("The competitive athletes have been chosen");
    }
    
                       
                       
                       
  }
}
    
