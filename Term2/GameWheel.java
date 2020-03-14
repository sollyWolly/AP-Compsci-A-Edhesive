/* Term 2 Assignment 5 - Game Wheel */
/* GameWheel class*/
import java.util.*;
import java.lang.*;

public class GameWheel
{
  // List of slices making up the wheel
  private List<Slice> slices;
  
  // Position of currently selected slice on wheel
  private int currentPos;

  
  /* Creates a wheel with 40 preset slices which are then randomized (keeping 
   * the color pattern the same).
   */
  public GameWheel()
  {
    slices = new ArrayList<Slice>();
    currentPos = 0;
    initGameWheel();
    scramble();
  }

  
  /* Spins the wheel by so that a different slice is selected. Return that 
   * slice (Note: the 20 slices following the current slice are more likely to 
   * be returned than the other 20).
   */
  public Slice spinWheel()
  {
    //spin power between range of 1-100 (inclusive)
    int power = (int)(Math.random()*100 + 1);
    int newPos = (currentPos + power) % slices.size();
    currentPos = newPos;
    return slices.get(currentPos);
  }
  
  
  /* Helper method for the constructor. Randomizes the positions of the slices 
   * that are in the wheel, but without changing the pattern of the colors 
   * (i.e. the red slices will still be at odd indices, the black slices at 
   * multiples of 10, and the blue slices at all other even indices).
   */ 
  private void scramble()
  {
    ArrayList <Slice> red = new ArrayList <Slice>();
    ArrayList <Slice> blue = new ArrayList <Slice>();
    ArrayList <Slice> black = new ArrayList <Slice>();
    ArrayList <Slice> temp = new ArrayList <Slice>();
    int rem = 0;
    for(int i = 0; i < 40; i++)
    {
      if(i % 2 == 1) //red
      {
        red.add(slices.get(i));
      }
      else if(i % 10 == 0) //black
      {
        black.add(slices.get(i));
      }
      else //blue
      {
        blue.add(slices.get(i));
      }
    }
    for(int i = 0; i < 40; i++)
    {
      if(i % 2 == 1)
      {
        rem = (int)(Math.random()*red.size());
        temp.add(red.get(rem));
        red.remove(rem);
      }
      else if(i % 10 == 0)
      {
        rem = (int)(Math.random()*black.size());
        temp.add(black.get(rem));
        black.remove(rem);
      }
      else
      {
        rem = (int)(Math.random()*blue.size());
        temp.add(blue.get(rem));
        blue.remove(rem);
      }
    }
    slices = temp;
  }
  
    
  // Helper method which initializes the slices in the wheel
  private void initGameWheel()
  {
    slices.add(new Slice("black", 8000));
    for (int i=1; i < 40; i++)
    {
      if (i%2 == 1)
        slices.add(new Slice("red", i*10));
      else if (i%10 == 0)
        slices.add(new Slice("black", i*200));
      else
        slices.add(new Slice("blue", i*100));
    }
  }
  
  
  // Returns the list of slices for this GameWheel
  public List<Slice> getSlices() {
    return slices;
  }
}

public class Main 
{
  public static void main (String[] args)
  {
    Gamewheel();
    Slice spin();
  }
}


