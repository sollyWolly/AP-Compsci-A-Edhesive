/* Term 2 Assignment 1 - Fraction */
/* A class which is used to represent fractions*/
public class Fraction
{
  private int numerator;
  private int denominator;
  private String mixed;
  private String powfu = "";
  
  // TODO write default constructor
  public Fraction()
  {
    numerator = 1;
    denominator = 1;
  }
  
  // TODO write constructor for fraction n/d where n, d > 0
  public Fraction(int n, int d)
  {
    if(n > 0){
      numerator = n;
    }
    if(n <= 0){
      numerator = 1;
    }
    if(d > 0){
      denominator = d;
    }
    if(d <= 0){
      denominator = 1;
    }
  }
  
  // TODO write method to return fraction as a String
  public String toString()
  {
    powfu = powfu + numerator + "/" + denominator;
    return powfu;
  }
  
  // TODO write method to return fraction as a mixed number String
  public String mixedNumber()
  {
    if(numerator > denominator){
      mixed = mixed + (numerator/denominator) + " " + (numerator-denominator) + "/" + denominator;
    }
    if(numerator < denominator){
      mixed = mixed + numerator + "/" + denominator;
    }
    if(numerator == denominator){
      
    }
    return mixed;
  }
  
  // TODO write method to add fraction n/d to this Fraction
  public void add(int n, int d)
  {
    if(n > 0 && d > 0)
    {
      numerator = numerator * d + denominator * n;
      denominator = denominator * d;
    }
  }
}
