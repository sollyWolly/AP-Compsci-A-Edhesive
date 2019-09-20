import java.util.Scanner;
import java.lang.Math; 

class Main {
    public static void main(String[] args)
    {
      System.out.println("Type the message to be shortened");
      Scanner scan = new Scanner(System.in);
      String word = scan.nextLine();
      word = word.toLowerCase();
      int repeat = 0;
      int vowel = 0;
      String newWord = word.substring(0,1);
      if(word.length() >= 10)
      {
        for (int i = 1; i < word.length() - 1; i++)
        {
          if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
          {
            vowel++;
          }
          else if(word.charAt(i) == word.charAt(i+1))
          {
            repeat++;
          }
          else
          {
            if(word.charAt(i) == ' ')
              newWord = newWord + word.substring(i,i+1) + "";
            else
              newWord = newWord + word.substring(i,i+1);
          }
        }
        System.out.println("Shortened message: " + newWord);
        System.out.println("Repeated letters removed: " + repeat);
        System.out.println("Vowels removed: " + vowel);
        System.out.println("Total characters saved: " + (vowel + repeat));
      }
      else
      {
        System.out.println("This doesn't need shortening!");
      }
   }
}