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
  static int jerseyNumber;
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
  }
  
  public String getPosition()
  {
    return position;
  }
  
  public String toString()
  {
    return (Person.lastname + ", " + Person.firstname + "\n   " + "Jersey #: " + jerseyNumber + "\n   " + "Position: " + position);
  }
}

