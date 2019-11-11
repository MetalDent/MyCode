//q28
import java.io.Console;
import java.util.Arrays;

public class consoleImplement {
    
    public static void main(String[] args)
    {       
        Console cnsl = System.console();
        try{ 
        	
        	String name = cnsl.readLine();
        	System.out.println(name);

        	char[] pwd = cnsl.readPassword("Password: ");
        	char[] repwd = cnsl.readPassword("Retype Password: ");
        	boolean isSame = Arrays.equals(pwd, repwd);
        	if(isSame)	System.out.println("Same");
        	else 	System.out.println("Invalid");
    	}
    	catch(Exception ex) {
        
        	 ex.printStackTrace();      
      	}
    }
}