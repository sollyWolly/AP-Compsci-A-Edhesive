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
    System.out.println("[Insert Really Interesting Swim Introduction or Backstory]");
    System.out.println("  ");
    System.out.println("[Insert Question Here]");
    System.out.println("  ");
    System.out.println("1 - Choice1");
    System.out.println("2 - Choice2");
    System.out.println("3 - Choice3");
    System.out.println("4 - Choice4");
    in = scan.nextInt();
    //Pathways
    if(in == 1)
    {
      System.out.println("Choice1 has been chosen");
    }
    else if(in == 2)
    {
      System.out.println("Choice2 has been chosen");
    }
    else if(in == 3)
    {
      System.out.println("Choice3 has been chosen");
    }
    else if(in == 4)
    {
      System.out.println("Choice4 has been chosen");
    }
  }
}
    
