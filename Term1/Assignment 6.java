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
 *then it should be ignore and the program should alternate to the other list again.
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

/*this assignment is pretty stupid but not that hard
  once you find out that you have to use two for loops:
     - one forward (flip)
     - one backward (sake)                             */

class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    int length1 = -1;
    //make the dummies who cant read input a correct length
    while(length1 < 10)
    {
      System.out.println("Enter an array length (must be 10 or greater)");
      length1 = scan.nextInt();
    }
    int arr1 [] = new int [length1];
    int arr2 [] = new int [length1];
    //assignment of array 1
    for(int a = 0; a < length1; a++)
    {
      if(a == 0){
        System.out.print("First Array:");
      }
      arr1[a] = (int)(Math.random() * 100 + 1);
      System.out.print(" " + arr1[a]);
    }
    //assignment of array 2
    for(int b = 0; b < length1; b++)
    {
      if(b == 0){
        System.out.println("");
        System.out.print("Second Array:");
      }
      arr2[b] = (int)(Math.random() * 100 + 1);
      System.out.print(" " + arr2[b]);
    }
    //merging the two arrays (mergeArr)
    int c  = length1 * 2; //2 arrays of the same length
    int count = 0;
    int z = 0;
    int mergeArr [] = new int [c];
    while(z < c)
    {
      mergeArr[z] = arr1[count];
      mergeArr[z+1] = arr2[count];
      count++;
      z+=2;
    }
    //Take each number and start looping from behind
    //in order to find repeats to rearrange the indexes forward
    //and replace ending elements with zeros (dont question the names of my variables here)
    for(int flip = 0; flip < c; flip++) //forwards loop
    {
      for(int sake = c - 1; sake > 0; sake--) //backwards loop
      {
        //make sure the the loop doesnt take out that flip value when sake overruns it
        if((mergeArr[flip] == mergeArr[sake]) && (flip != sake)){
          for(int cup = sake; cup < c; cup++)
          {
            if(cup == c - 1){
              mergeArr[cup] = 0;
            }
            else{
              mergeArr[cup] = mergeArr[cup+1];
            }
          }
        }
      }
    }
    //print the merged array BUT dont forget to exclude the zeros
    for(int shoot = 0; shoot < c; shoot++)
    {
      if(shoot == 0)
      {
        System.out.println("");
        System.out.print("Merged Array:");
      }
      if(mergeArr[shoot] != 0){
        System.out.print(" " + mergeArr[shoot]);
      }
    }
  }
}
