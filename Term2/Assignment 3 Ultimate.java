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
  static int jerseyNumber = 0;
  private String position;
  
  public UltimatePlayer(String firstName, String lastName, String pos)
  {
    super(firstName, lastName);
    UltimatePlayer.jerseyNumber++;
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
    return (super.toString() + "\n   " + "Jersey #: " + jerseyNumber + "\n   " + "Position: " + position);
  }
}

