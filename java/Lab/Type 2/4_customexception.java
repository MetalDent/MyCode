class customexception extends Exception 
{ 
    public customexception(String s) 
    { 
        super(s); 
    } 
} 
  
class Main 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new customexception("throw exception"); 
        } 
        catch (customexception e) 
        { 
            System.out.println("Caught"); 
  
            System.out.println(e.getMessage()); 
        } 
    } 
}