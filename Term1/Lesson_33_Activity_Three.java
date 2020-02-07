/*
 * Lesson 33 Coding Activity 3
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints and prints the array on a 
 * single line. Print one space between each number.
 * 
 * This method must be called printit() and it must take an int[] parameter.
 */


import java.util.Scanner;

class Lesson_33_Activity_Three {
  
    public static void printit(int arr [])
    {
      for(int i  = 0; i < arr.length; i++){
        System.out.print(arr[i]);
        if(i != arr.length - 1)
        {
          System.out.print(" ");
        }
      }
    }
    
    public static void main(String[] args)
     {
      int Array [] = new int [] {1,2,3,4,5,6,7,8};
      printit(Array);
    }
}
