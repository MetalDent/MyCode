import java.io.*;

class mergeFiles {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writerObj = new PrintWriter("file3.txt");

        BufferedReader readerf1 = new BufferedReader(new FileReader("../Type 2/demo1")); 
        BufferedReader readerf2 = new BufferedReader(new FileReader("../Type 2/demo2")); 
          
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