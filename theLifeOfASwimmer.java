import java.util.Scanner;
//Project
public class Main
{
  //I'm going to use these as obtainables so that you can access other areas
  
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
      System.out.println("You walk up to the captain. He asks \"What do you want?\"");
      System.out.println("1 - \"Which events am I swimming?\"");
      System.out.println("2 - \"Can I be on varsity?\"");
      System.out.println("3 - \"You are honestly so bad at swimming.\"");
      in = scan.nextInt();
      if(in == 1)
      {
        System.out.println("He says \"Go look at the psych sheet you moron\"");
        System.out.println("1 - Go look at the psych sheet");
        System.out.println("2 - Demand to know the events from him");
        in = scan.nextInt();
        if(in == 1)
        {
          System.out.println("You look at the psych sheet. You don't see your name. You realize that the coach didn't put you in any events. You go home and eat ice cream.");
          end no event = new end(false); 
        }
        else if(in == 2)
        {
          System.out.println("He says \"Alright if you're going to be rude about it, then I'm going to kick you off the team. Goodbye.\"");
          end rude = new end(false); 
        }
      }
      else if(in == 2)
      {
        System.out.println("He says \"Of course you can't. You're literally the worst swimmer here. My grandma can dive better than you.\"");
        System.out.println("1 - \"Let's race then.\"");
        in = scan.nextInt();
        if(in == 1)
        {
          System.out.println("He agrees and you guys start to race. You win with a minute lead. He gets really mad and decides to quit. Coach makes you the new captain.");
          end friendquit = new end(false); 
        }
      }
      else if(in == 3)
      {
        System.out.println("He says \"DO YOU KNOW WHO YOU'RE TALKING TO??!! There's a reason the coach made me captain.\"");
        System.out.println("1 - \"Yeah I bet it's because he felt sorry for you.\"");
        System.out.println("2 - \"Yeah well the coach might not be so bright then\"");
        in = scan.nextInt();
        if(in == 1)
        {
          System.out.println("He says \"Oh that's it, I'm asking coach if that's true. COACH IS THAT TRUE?\" Coach says \"Yes, you are only captain because I felt sorry for you\"");
          end crying = new end(true); 
        }
        else(in == 2)
        {
          System.out.println("He says \"COACH, THE NEW GUY SAYS YOU'RE STUPID.\" You get kicked off the team.");
          end badcoach = new end(false); 
        }
      }
    }
    else if(in == 2)
    {
      System.out.println("You walk up to the casual swimmers. They are playing Smash on the Nintendo Switch.");
      System.out.println("1 - \"Can I join?\"");
      System.out.println("2 - \"Don't you guys think Smash is bad game.\"");
      System.out.println("3 - \"YOU GUYS MISSED YOUR EVENTS!!!\"");
      in = scan.nextInt();
      if(in == 1)
      {
        System.out.println("They ignore you. You take the switch and throw it into the water. They all start beating you up.");
        end switchwater = new end(false); 
      }
      else if(in == 2)
      {
        System.out.println("They all stop playing the game and without saying any words, they start beating you up.");
       end stopgame = new end(false); 
      }
      else if(in == 3)
      {
        System.out.println("They all start freaking out and running over to the starting blocks. You finesse their Switch and go home.");
        end crying = new end(true); 
      }
    }
    else if(in == 3)
    {
      System.out.println("You walk over to the competitive swimmers. They are all wearing headphones, so they can't hear you. You try to get the attention of one of them.");
      System.out.println("1 - Snap in front of him");
      System.out.println("2 - Rip off his headphones.");
      System.out.println("3 - Beat him up");
      in = scan.nextInt();
      if(in == 1)
      {
        System.out.println("He says \"Hey what's up bud.\"");
        System.out.println("1 - \"You smell like garbage.\"");
        System.out.println("2 - \"Do you want to be friends?\"");
        System.out.println("3 - \"Do you want the other half of my corndog?\"");
        in = scan.nextInt();
        if(in == 1)
        {
          System.out.println("He says \"Takes one to know one buddy.\" You are so traumatized by that comeback that you die.");
          end comeback = new end(false); 
        }
        else if(in == 2)
        {
          System.out.println("He says \"Yeah, let's be friends!\" You both walk away from the pool holding hands and frolicked into the sunset.");
          end crying = new end(true); 
        }
        else if(in == 3)
        {
          System.out.println("He says \"Hmmm. What's in it for me?\"");
          System.out.println("1 - \"The corndog allows you to harness dark magic.\"");
          System.out.println("2 - \"The corndog gives you super strength.\"");
          System.out.println("3 - \"The corndog tastes good.\"");
          in = scan.nextInt();
          if(in == 1)
          {
            System.out.println("He says \"Oh boy, Gimme that.\" He eats the corndog and then dies.");
            end corndog = new end(false); 
          }
          else if(in == 2)
          {
            System.out.println("He says \"Okay I'll try it.\"He eats the corndog and then his arms disappear. Coach kicks both of you off the team.");
           end arms = new end(false); 
          }
          else if(in == 3)
          {
            System.out.println("He says \"Alright.\" He eats the corndog and nothing happens. You miss your event while this is happening. Coach kicks you off the team.");
            end missevent = new end(false); 
          }
        }
      }
      else if(in == 2)
      {
        System.out.println("He punches u in the stomach so hard that you go flying 25 meters over the pool to the other side");
        end punch = new end(false); 
      }
      else if(in == 3)
      {
        System.out.println("He starts crying. The coach sees you and kicks you off the team.");
        end crying = new end(false); 
      }
    }                  
  }
}
    
                       
public class end {
  boolean result;
  
  public end (entry){
    result = entry;
  }
  
  public boolean getResult {
    return result;
  }
  
}
