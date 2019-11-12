import java.util.*;
import java.io.*;

class sort_stack
{
	public static void main(String[] args) 
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= obj.nextInt();
		Stack<Integer> input = new Stack<Integer>(); 
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			int f=obj.nextInt();
			input.add(f);
		}

		
		Stack<Integer> tmpStack=sortstack(input); 
        System.out.println("Sorted numbers are:"); 
      
        while (!tmpStack.empty()) 
           System.out.println(tmpStack.pop()); 
         
    } 

public static Stack<Integer> sortstack(Stack<Integer>  
                                             input) 
    { 
        Stack<Integer> tmpStack = new Stack<Integer>(); 
        while(!input.isEmpty()) 
        { 
            int tmp = input.pop(); 
          
            while(!tmpStack.isEmpty() && tmpStack.peek()  
                                                 > tmp) 
            { 
                input.push(tmpStack.pop()); 
            } 
              
            tmpStack.push(tmp); 
        } 
        return tmpStack; 
    } 
}

