class Temp 
{ 
    // default constructor 1 
    Temp() 
    { 
        System.out.println("default"); 
    } 
  
    // parameterized constructor 2 
    Temp(int x) 
    { 
        // invokes default constructor 
        this(); 
        System.out.println(x); 
    } 
  
    // parameterized constructor 3 
    Temp(int x, int y) 
    { 
        // invokes parameterized constructor 2 
        this(5); 
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
        // invokes parameterized constructor 3 
        new Temp(8, 10); 
    } 
} 