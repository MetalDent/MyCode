import java.util.Scanner;
 
class sorting {
  public static void main(String []args) {
    int n,choice;
    Scanner in = new Scanner(System.in);
     System.out.println("Enter your choice: \n1: Bubble sort \n2: Selection sort");
    choice = in.nextInt();
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter integers");
    for ( int i = 0; i < n; i++)
      array[i] = in.nextInt();
   
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
 
    for (int i = 0; i < n; i++)
      System.out.println(array[i]);
  }
  public static void bubblesort(int arr[])
  {
    int n=arr.length;

     for (int i = 0; i < ( n - 1 ); i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j+1]) 
        {
          int tmp       = arr[j];
          arr[j]   = arr[j+1];
          arr[j+1] = tmp;
        }
      }
    }

  }
  public static void selectionsort(int[] arr)
  {  
    for (int i = 0; i < arr.length - 1; i++)  
    { 
      int index = i;  
      for (int j = i + 1; j < arr.length; j++)
      {   
        if (arr[j] < arr[index]){ 
          index = j;
        }  
      }  
 
      int smallerNumber = arr[index];   
      arr[index] = arr[i];  
      arr[i] = smallerNumber;  
      
    }  
  }  
}