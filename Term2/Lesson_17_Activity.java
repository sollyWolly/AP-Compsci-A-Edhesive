class Lesson_17_Activity
{
public static boolean isSorted(int [] a)
  {
    for(int i = 0; i < a.length-1; i++)
    {
      if(a[i] > a[i+1])
      {
        return false;
      }
    }
    return true;
  }
 public static int binarySearch(int [] a, int b) {
   int low = 0;
   int high = a.length - 1;
   while (low <= high)
   {
       int mid = low + ((high - low) / 2);
       if (a[mid] > b)
       {
           high = mid - 1;
       }
       else if (a[mid] < b)
       {
           low = mid + 1;
       }
       else{
           return mid; // found
       }
   }
   return -1; // not found
}
 } 
