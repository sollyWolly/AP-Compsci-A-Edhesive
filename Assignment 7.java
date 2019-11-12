import java.util.Scanner;

class Main {
  
    public static void duplicate(String str)
    {
      int n = str.length();
      if(n % 2 == 0){
        n *= 2;
      }
      for(int i = 0; i < str.length(); i++){
        for(int p = 0; p < n; p++){
          System.out.print(str.substring(i,i+1));
        }
      }
    }
    
    public static void isEdhesivePalindrome(String str)
    {
      if((str.length() < 3) || (str.length() > 15)){
        System.out.println("Too bad, that isn't an Edhesive Palindrome.");
      }
      else{
        str = str.toLowerCase();
        String [] change = new String [1];
        for(int s = 0; s < str.length(); s++)
        {
          if (str.charAt(s) == '4'){
            change[0] = change[0] + "a";
            System.out.println(change[0]);
          }
          else if (str.charAt(s) == '3'){
            change[0] = change[0] + "e";
            System.out.println(change[0]);
          }
          else if (str.charAt(s) == '0'){
            change[0] = change[0] + "o";
            System.out.println(change[0]);
          }
          else{
            if(s == 0)
            {
              change[0] = str.substring(s,s+1);
              System.out.println(change[0]);
            }
            else
            {
              change[0] = change[0] + str.substring(s,s+1);
              System.out.println(change[0]);
            }
          }
        }
        int z = str.length() - 1;
        for(int y = 0; y < str.length(); y++){
          if(change[0].charAt(y) == change[0].charAt(z))
          {
            z = z - 1;
          }
          else
          {
            System.out.println(change[0]);
            System.out.println("Too bad, that isn't an Edhesive Palindrome.");
            return;
          }
        }
        System.out.println("Nice, you found an Edhesive Palindrome!");
        return;
      }
    }
    
    public static double numberScramble(double num)
    {
      if(num < 0)
      {
        System.out.println("The scrambled number is: " + 0.0);
      }
      num = Math.sqrt(((num+5)/2));
      System.out.println("The scrambled number is: " + num);
      return num;
    }
    
    public static void main(String[] args)
    {
      Scanner scan = new Scanner (System.in);
      System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
      String name = scan.nextLine();
      duplicate(name);
      System.out.println("");
      System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
      String pal = scan.nextLine();
      isEdhesivePalindrome(pal);
      System.out.println("");
      System.out.println("Almost done! Please enter a number to scramble.");
      double number = scan.nextDouble();
      numberScramble(number);
    }
}
