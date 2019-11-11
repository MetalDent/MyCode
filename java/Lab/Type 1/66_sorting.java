import java.util.Scanner;
 
class q66sortings {
  public static void main(String []args) {
    int n  ,choice;
    Scanner in = new Scanner(System.in);
     System.out.println("enter 1 for bubble sort\n2 for selection sort");
    choice = in.nextInt();
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter integers");
 int c;
    for ( c = 0; c < n; c++)
      array[c] = in.nextInt();
   
   switch(choice)
   {
    case 1:
    bubblesort(array);
    break;
    case 2:
    selectionsort(array);
    break;
    default:
        System.out.println("wrong choice");

   }
 
    System.out.println("Sorted list of numbers:");
 
    for (c = 0; c < n; c++)
      System.out.println(array[c]);
  }
  public static void bubblesort(int array[])
  {
    int n=array.length;
        int d, swap;
        int c;

     for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1]) /* For descending order use < */
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }

  }
  public static void selectionsort(int[] array)
  {  
    for (int i = 0; i < array.length - 1; i++)  
    { 
      int index = i;  
      for (int j = i + 1; j < array.length; j++)
      {   
        if (array[j] < array[index]){ 
          index = j;
        }  
      }  
 
      int smallerNumber = array[index];   
      array[index] = array[i];  
      array[i] = smallerNumber;  
      
    }  
  }  
}