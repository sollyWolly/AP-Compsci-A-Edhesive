/*
 * Lesson 30 Coding Activity 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:        
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *         
 * Note that this activity does not require you to print anything. 
 * Your code should end with the array list still declared and
 * containing the resulting words.
 * 
 */


import java.util.Scanner;

class Lesson_30_Activity {
     
    public static String [] list = {"every", " near ing ", " checking", "food ", "stand", "value "};
  
    public static void main(String[] args)
    {
        String temp = "";
        for(int i = 0; i<list.length; i++)
        {
            temp = "";
            for(int n = 0; n<list[i].length; n++)
            {
                if(list[i].substring(n, n+1) != " ")
                    temp = temp + list[i].substring(n, n+1);
            }
            list[i] = temp;
        }
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
    }
}
