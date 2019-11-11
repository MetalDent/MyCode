//q48
public class overrideToString {
	
	public static void main(String[] args) {
		
		complexNo z = new complexNo(10, 15); 
        System.out.println(c1); 
	}
}
class complexNo { 

    private double real, imaginary; 
  
    public complexNo(double real, double imaginary) { 
        
        this.real = real; 
        this.imaginary = imaginary; 
    }
    @Override
    public String toString() { 
        return String.format(real + " + i" + imaginary); 
    } 
} 