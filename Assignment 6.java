/*
 * Assignment 6
 *
 *In this assignment, you will write a program which merges two arrays of positive integers and removes any duplicate entries.
 *Your program will first ask for a valid length which must be an integer which is 10 or greater.
 *The program should continue to ask until a valid length is entered.
 *The program will then:
 *   - create two arrays of the length entered
 *   - fill these with random integers between 1 and 100 inclusive
 *   - print both of these arrays
 *
 *Finally, the program will create and print an array using all the elements which are in the two arrays
 *but not including any duplicates.
 *The merged array may have space for more elements than needed:
 *extra elements at the end of the array should be set to 0 and not printed by the program.
 *
 *The numbers should be added to the merged array in an alternating pattern:
 *    - first from list 1, then from list 2, then list 1 again, etc.
 *If a number in one of the arrays already appears in the merged array
 *then it should be ignored
 *and the program should alternate to the other list again.
 *
 *For example, if the first list begins 1 2 3 10, and the second begins 3 4 5 8, then the merged list would begin 1 3 2 4 5 10 8.
 *
 *Because the number of elements in the merged array is unknown,
 *its size should be set to the maximum possible number of elements it should contain,
 *and after all elements which should form the merged array appear,
 *any remaining unfilled spaces in the array should be 0.
 *The first 0 encountered in the array should signal the end of the “actual” elements of the array,
 *and therefore the 0s at the end of the array should not be printed by your program.
 *
 *Be sure that your output is in the format shown in the sample run, with one array on each line and each one named correctly:
 *the Code Runner needs to be able to read the arrays that are printed in order to correctly grade your work.
 *
 */

import java.util.Scanner;
import java.lang.Math; 

class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter an array length (must be 10 or greater)");
    int length1 = scan.nextInt();
    System.out.println("Enter an array length (must be 10 or greater)");
    int length2 = scan.nextInt();
    int arr1 [] = new int [length1];
    int arr2 [] = new int [length2];
    System.out.print("First Array:");
    for(int a = 0; a < length1; a++)
    {
      arr1[a] = (int)(Math.random() * 100 + 1);
      System.out.print(" ");
      System.out.print(arr1[a]);
    }
    System.out.println("");
    System.out.print("Second Array:");
    for(int b = 0; b < length2; b++)
    {
      arr1[b] = (int)(Math.random() * 100 + 1);
      System.out.print(" ");
      System.out.print(arr1[b]);
    }
    int c = 0;
    System.out.println("");
    System.out.println("Merged Array:");
    while(c < length1 && c < length2)
    {
    }
  }
}
