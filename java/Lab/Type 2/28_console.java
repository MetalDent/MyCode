import java.io.Console;
import java.util.Arrays;

class console {
    
    public static void main(String[] args)
    {       
        Console c = System.console();
        try{ 
        	
        	String name = c.readLine();
        	System.out.println(name);

        	char[] pass = c.readPassword("Password: ");
        	char[] re_pass = c.readPassword("Retype Password: ");
        	boolean isSame = Arrays.equals(pass, re_pass);
        	if(isSame)	
                System.out.println("Same");
        	else 	
                System.out.println("Invalid");
    	}
    	catch(Exception e) {
        
        	 e.printStackTrace();      
      	}
    }
}