import java.io.*; 
  
class singleton 
{ 
    static singleton instance = null; 
    public int x = 10; 
    
    private singleton() {  } 
   
    static public singleton getInstance() 
    { 
        if (instance == null)         
             instance = new singleton(); 
   
        return instance; 
    }  
} 
  
class Main 
{ 
   public static void main(String args[])     
   { 
       singleton obj1 = singleton.getInstance(); 
       singleton obj2 = singleton.getInstance(); 
       obj1.x = obj1.x + 10; 
       System.out.println("Value of a.x = " + obj1.x); 
       System.out.println("Value of b.x = " + obj2.x); 
   }     
} 