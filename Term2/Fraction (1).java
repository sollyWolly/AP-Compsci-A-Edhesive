/* Term 2 Assignment 4 - Fraction Comparable */

/* A class which is used to represent fractions and implements
 * the comparable interface
 */
public class Fraction
{
  private int numerator;
  private int denominator;
  
  // Default constructor: creates fraction 1/1
  public Fraction()
  {
    numerator = 1;
    denominator = 1;
  }
  
  // Constructor for fraction n/d where n, d > 0
  public Fraction(int n, int d)
  {
    this();
    if(n > 0)
    {
      numerator = n;
    }
    if(d > 0)
    {
      denominator = d;
    }
  }
  
  // Return the fraction as a String e.g. "2/3"
  public String toString()
  {
    return numerator + "/" + denominator;
  }
  
  // Return the fraction as a mixed number String
  public String mixedNumber()
  {
    // If fraction is proper return fraction using toString method
    if(numerator < denominator)
    {
      return toString();
    }
    
    // If numerator is a multiple of denominator return just integer part
    if (numerator % denominator == 0)
    {
      return "" + numerator/denominator;
    }
    
    // Otherwise return mixed number string
    return numerator/denominator + " " + numerator%denominator + "/" + denominator;
  }
  
  // Adds the fraction n/d to this fraction if n and d are both greater than 0
  public void add(int n, int d)
  {
    if(n > 0 && d > 0)
    {
      numerator = numerator * d + n * denominator;
      denominator *= d;
    }
  }
}