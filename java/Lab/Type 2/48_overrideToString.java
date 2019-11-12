class overrideToString {
	
	public static void main(String[] args) {
		
		complex z = new complex(3, 5); 
        System.out.println(z); 
	}
}
class complex { 

    private double r, i; 
  
    public complex(double r, double i) { 
        
        this.r = r; 
        this.i = i; 
    }

    @Override
    public String toString() { 
        return String.format(r + " + i" + i); 
    } 
} 