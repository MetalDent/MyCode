class constructor_overloading 
{ 
    double w, h, d; 
  
    constructor_overloading(double w, double h, double d) 
    { 
        w = w; 
        h = h; 
        h = d; 
    } 
  
    constructor_overloading() 
    { 
        w = h = h = 0; 
    } 
  
    constructor_overloading(double len) 
    { 
        w = h = h = len; 
    } 
  
    double volume() 
    { 
        return w * h * h; 
    } 
} 
  
class Test 
{ 
    public static void main(String args[]) 
    { 
        constructor_overloading obj1 = new constructor_overloading(2, 4, 10); 
        constructor_overloading obj2 = new constructor_overloading(); 
        constructor_overloading obj3 = new constructor_overloading(14); 
  
        double vol; 
  
        vol = obj1.volume(); 
        System.out.println(" Volume of mybox1 is " + vol); 
  
        vol = obj2.volume(); 
        System.out.println(" Volume of mybox2 is " + vol); 
  
        vol = obj3.volume(); 
        System.out.println(" Volume of mycube is " + vol); 
    } 
} 