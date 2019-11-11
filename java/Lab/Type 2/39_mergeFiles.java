//q 39
//copied from gfg and just changed names
import java.io.*;

public class mergeFiles {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writerObj = new PrintWriter("file3.txt");

        BufferedReader readerf1 = new BufferedReader(new FileReader("/home/sundarayamrita/Documents/annaKarenina.txt")); 
        BufferedReader readerf2 = new BufferedReader(new FileReader("/home/sundarayamrita/Documents/Programming/tswe/python/assignment/WarAndPeace.txt")); 
          
        String line1 = readerf1.readLine(); 
        String line2 = readerf2.readLine(); 
 
        while (line1 != null || line2 !=null) { 

            if(line1 != null) { 

                writerObj.println(line1); 
                line1 = readerf1.readLine(); 
            } 
              
            if(line2 != null) { 

                writerObj.println(line2); 
                line2 = readerf2.readLine(); 
            } 
        } 
      
        writerObj.flush(); 
        readerf1.close(); 
        readerf2.close(); 
        writerObj.close(); 
	}
}