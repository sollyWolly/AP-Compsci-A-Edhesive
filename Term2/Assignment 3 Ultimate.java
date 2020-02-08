//Person Class Submission
public class Person
{
  private String firstname;
  private String lastname;
  
  public Person(String firstName, String lastName)
  {
    firstname = firstName;
    lastname = lastName;
  }
  
  public String toString()
  {
    return (lastname + ", " + firstname);
  }
}

//UltimatePlayer Class Submission

public class UltimatePlayer extends Person
{
  private int jerseyNumber = 0;
  private static int num = 0;
  private String position;
  
  public UltimatePlayer(String firstName, String lastName, String pos)
  {
    super(firstName, lastName);
    if(!pos.equals("handler") && !pos.equals("cutter"))
    {
      position = "handler";
    }
    else
    {
      position = pos;
    }
    num++;
    jerseyNumber = num;
  }
  
  public String getPosition()
  {
    return position;
  }
  
  public String toString()
  {
    return (super.toString() + "\n   " + "Jersey #: " + jerseyNumber + "\n   " + "Position: " + position);
  }
}

public class Captain extends UltimatePlayer
{
  boolean type;
  
  public Captain(String firstName, String lastName, String position, boolean t)
  {
    super(firstName, lastName, position);
    type = t;
  }
  
  public String toString()
  {
    if(type)
    {
      return super.toString() + "\n   Captain: offense";
    }
    else
    {
      return super.toString() + "\n   Captain: defense";
    }
  }
}

public class Coach extends Person
{
  private String role;
  
  public Coach(String firstName, String lastName, String r)
  {
    super(firstName, lastName);
    role = r;
  }
  
  public String toString()
  {
    return super.toString() + "\n   Role: " + role;
  }
}

public class UltimateTeam
{
  private ArrayList <UltimatePlayer> players = new ArrayList <UltimatePlayer>();
  private ArrayList <Coach> coaches = new ArrayList <Coach>();
  String powfu = "";
  String ouse = "";
  
  public UltimateTeam(ArrayList<UltimatePlayer> play, ArrayList<Coach> coach)
  {
     for(int count1 = 0; count1 < play.size(); count1++)
     {
       players.add(play.get(count1));
     }
     for(int count2 = 0; count2 < coach.size(); count2++)
     {
       coaches.add(coach.get(count2));
     }
  }
  
  public String getCutters()
  {
    powfu = "";
    for(int i = 0; i < players.size(); i++)
    {
      if(players.get(i).getPosition().equals("cutter"))
      {
        powfu += "\n" + players.get(i).toString();
      }
    }
    return powfu;
  }
  
  public String getHandlers()
  {
    ouse = "";
    for(int i = 0; i < players.size(); i++)
    {
      if(players.get(i).getPosition().equals("handler"))
      {
        ouse += "\n" + players.get(i).toString();
      }
    }
    return ouse;
  }
  
  public String toString()
  {
    powfu = "";
    ouse = "";
    for (UltimatePlayer p : players)
    {
        powfu += p.toString() + "\n";
    }

    for (Coach c : coaches)
    {
        ouse += c.toString() + "\n";
    }
    return "COACHES\n" + ouse + "\nPLAYERS\n" + powfu;
  }
}





