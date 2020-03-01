/* Term 2 Assignment 4 - Fraction Comparable */

/* A class which is used to represent fractions and implements
 * the comparable interface
 */

import java.math.BigInteger;

public class Fraction implements Comparable
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
    simplify();
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
    simplify();
  }
  public int compareTo(Object other)
  {
    Fraction target;
    target = (Fraction) other;
    int thisNumer = this.numerator;
    int thisDenom = this.denominator;
    int otherNumer = target.numerator;
    int otherDenom = target.denominator;
    thisNumer *= otherDenom;
    otherNumer *= thisDenom;
    if(thisNumer < otherNumer)
    {
      return -1;
    }
    if(thisNumer > otherNumer)
    {
      return 1;
    }
    return 0;
  }
  public static int gcd(int a, int b)
  {
    int num1 = a;
    int num2 = b;
    int gcdActual = 1;
    for(int i = 1; i <= num1 && i <= num2; i++)
    {
      if(num1%i==0 && num2%i==0)
      {
        gcdActual = i;
      }
    }
    return gcdActual;
  }
  public void simplify()
  {
    int div = gcd(numerator, denominator);
    numerator = numerator/div;
    denominator = denominator/div;
  }
}





