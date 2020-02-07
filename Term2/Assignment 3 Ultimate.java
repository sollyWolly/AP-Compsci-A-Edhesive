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
  String role;
  
  public Coach(String firstName, String lastName, String r)
  {
    super(firstName, lastName);
    role = r;
  }
  
  public String toString()
  {
    return super.toString() + "\n   role: " + role;
  }
}






