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

class Main {
  public static void sort(ArrayList <TeamMember> a)
  {
    for(int i = 1; i < a.size(); i++)
    {
      for(int j = i; j > 0; j--)
      {
        if(a.get(j).compareTo(a.get(j-1)) == -1)
        {
          TeamMember temp = a.get(j);
          a.set(j, a.get(j-1));
          a.set(j-1, temp);
        }
      }
    }
  }
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    ArrayList <TeamMember> list = new ArrayList <TeamMember>();
    ArrayList<TeamMember> sorted = new ArrayList <TeamMember>();
    String name = "";
    String ID = "1";

    while(!(name.equals("stop")))
    {
      System.out.println("Enter the next name:");
      name = scan.nextLine();
      name = name.toLowerCase();
      if (!(name.equals("stop")))
      {
        System.out.println("Enter the next ID:");
        ID = scan.nextLine();
        TeamMember a = new TeamMember(name, ID);
        list.add(a);
      }
    }
    sort(list);
    System.out.println(list);
 }
}
    
    






    
    
    
