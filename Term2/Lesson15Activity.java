public class Lesson_15_Activity
{
  public static void sortAndPrint(String [] list)
  {
    String [] party = list;
    String temp;
    for(int i = 0; i < party.length; i++)
    {
      for(int k = i; k < party.length; k++)
      {
          if(party[k].compareTo(party[i]) < 0)
          {
              temp = party[i];
              party[i] = party[k];
              party[k] = temp;
          }
      }
    }
    for(int i = 0; i < party.length; i++)
    {
      System.out.print(party[i]);
      if(i != party.length -1)
      {
        System.out.print(" ");
      }
    }
  }
  public static void main(String [] args)
  {
      String [] hi = {"against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
      sortAndPrint(hi);
  }
}
