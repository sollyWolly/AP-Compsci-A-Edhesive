import java.util.*;
import java.lang.*;

public class TeamMember
{
  private String fullname;
  private String idString;
  ArrayList <TeamMember> list = new ArrayList <TeamMember>();
  //METHOD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public TeamMember(String n, String id)
  {
    idString = id;
    fullname = n.substring(0, 1).toUpperCase();
    for(int i = 1; i < n.length(); i++)
    {
      if(n.substring(i, i+1).equals(" "))
      {
        fullname += " ";
      }
      else if(n.substring(i-1, i).equals(" "))
      {
        fullname += n.substring(i, i+1).toUpperCase();
      }
      else
      {
        fullname += n.substring(i, i+1).toLowerCase();
      }
    }
  }
  //METHOD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public String toString() 
  {
    return fullname;
  }
  //METHOD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public int compareTo(TeamMember other)
  {
    if(this.idString.compareTo(other.idString) > 0)
    {
      return 1;
    }
    else if(this.idString.compareTo(other.idString) < 0)
    {
      return -1;
    }
    else
    {
      return 0;
    }
  }
}

public class Main extends TeamMember
{
  public void powfuSort()
  {
    
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    String input1 = "";
    String input2 = "";
    while(!input.toLowerCase.equals("stop"))
    {
      System.out.println("Enter the next name:");
      input1 = scan.nextLine();
      if(input1.toLowerCase().equals("stop"))
      {
        break;
      }
      System.out.println("Enter the next ID:");
      input2 = scan.nextLine();
      if(input2.toLowerCase().equals("stop"))
      {
        break;
      }
      list.add(new TeamMember(input1, input2));
      powfuSort();
      ArrayList.toString();
    }
  }
}
    
    






    
    
    
