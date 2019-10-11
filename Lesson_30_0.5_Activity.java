/*
 * Lesson 30 1/2 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity{
    public static void main(String[] args)
     {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a number in base 8:");
      String eight = scan.nextLine();
      int n = Integer.parseInt(eight);
      int count = 0;
      int oldNum;
      int newNum;
      int total = 0;
      if(n < 77777777 && n >= 0){
        while (n != 0)
        {
          n /= 10;
          count++;
        }
        String[] arrOld = new String[count];
        for(int i = 0; i < count; i++)
        {
          arrOld[i] = eight.substring(i, i+1);
          if(Integer.parseInt(arrOld[i]) > 7)
          {
            System.out.println("ERROR: Incorrect Octal Format");
            return;
          }
        }
        int [] arrNew = new int [count];
        int p = count - 1;
        for(int s = 0; s < count; s++)
        {
          System.out.println("[d]: arrNew[s]: "+Integer.parseInt(arrOld[s]));
          System.out.println("[d]: p: "+p);
          arrNew[s] = Integer.parseInt(arrOld[s]);
          arrNew[s] = arrNew[s] * (int)(Math.pow(8, p));
          System.out.println(arrNew[s]);
          total += arrNew[s];
          p = p - 1;
        }
        System.out.println(arrNew[0]);
        System.out.println(arrNew[1]);
        System.out.println(arrNew[2]);
        System.out.println(total);
      }
      else{
        System.out.println("ERROR: Incorrect Octal Format");
      }
     }
}
