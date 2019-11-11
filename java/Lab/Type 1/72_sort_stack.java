import java.util.*;
import java.io.*;
class q72stack
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
            // pop out the first element 
            int tmp = input.pop(); 
          
            // while temporary stack is not empty and 
            // top of stack is greater than temp 
            while(!tmpStack.isEmpty() && tmpStack.peek()  
                                                 > tmp) 
            { 
                // pop from temporary stack and  
                // push it to the input stack 
            input.push(tmpStack.pop()); 
            } 
              
            // push temp in tempory of stack 
            tmpStack.push(tmp); 
        } 
        return tmpStack; 
    } 
}

