class q15
{
  public static void main(String[] args)
  {        
        System.out.println("Largest no. is " +  
                             MaxValue()); 
    

   }
    public static int MaxValue() 
    { 
        int res = 2; 
        long fact = 2; 
        while (true) 
        { 
            
            if (fact < 0) 
                break; 
            res++; 
            fact = fact * res; 
        } 
        return res - 1; 
    } 
  
}