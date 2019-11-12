class constructor_chaining 
{ 
    constructor_chaining() 
    { 
        System.out.println("default"); 
    } 
  
    constructor_chaining(int x) 
    { 
        this(); 
        System.out.println(x); 
    } 
  
    constructor_chaining(int x, int y) 
    { 
        this(5); 
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
        new constructor_chaining(8, 10); 
    } 
} 