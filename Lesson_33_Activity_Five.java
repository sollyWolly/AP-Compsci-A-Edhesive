/*
 * Lesson 33 Coding Activity 5
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints, an integer value, 
 * and an integer index.The method should insert the value at the given
 * index and move the values afterwards by one.
 * 
 * This method must be called insertValue() and must have the following 
 * parameter types: int[], integer, integer. 
 * 
 * Calling insertValue(a, 100, 2) would change the array {1, 2, 3, 4, 5} 
 * to {1, 2, 100, 3, 4}.
 */


import java.util.Scanner;

class Lesson_33_Activity_Five {
  
    public static void insertValue(int arr [], int a, int b)
    {
      int temp = arr[b];
      int temp2;
      arr[b] = a;
      for(int i = b + 1; i < arr.length; i++)
      {
        temp2 = arr[i];
        arr[i] = temp;
      }
    }
  
    public static void main(String[] args)
    {
     int Array [] = new int [] {1,2,3,4,5};
     insertValue(Array, 100, 2);
    }
}
