import java.util.Scanner;
import java.util.ArrayList;

class Main {
    
    public static void main(String args[])
    {
      Scanner scan = new Scanner (System.in);
      ArrayList myList = new ArrayList();
      System.out.println("Please enter words, enter STOP to stop the loop.");
      String word = scan.nextLine();
      while(!word.equals("STOP"))
      {
          myList.add(word);
          word = scan.nextLine();
      }
      System.out.println(myList.size());
      System.out.println(myList);
      if(myList.size() > 2)
      {
          myList.remove(0);
          myList.remove(myList.size()-1);
      }
      System.out.println(myList);
    }
}
