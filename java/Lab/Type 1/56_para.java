import java.util.*;

class para {
    
    int countWords(String s) {
        StringTokenizer token = new StringTokenizer(s," .,?!");
        int count = token.countTokens();
        return count;
    } 
     
    void sort(String w[], int p[]) {
        int n = w.length, t = 0;
        String ts = "";
         
        for(int i = 0 ; i < n-1 ; i++) {
        	for(int j = i+1 ; j < n; j++) {               
        		if(p[i] > p[j]) {

                    t = p[i];
                    p[i] = p[j];
                    p[j] = t;
                    ts = w[i];
                    w[i] = w[j];
                    w[j] = ts;
                }
            }
        }
        
        printResult(w,p);    
    }
     
    void printResult(String w[], int p[]) {
        
        int n = w.length;
        for(int i = 0 ; i < n;  i++) {           
    		System.out.println(w[i]);    
     	}     
	}          
 	
 	public static void main(String args[]) {        
 		para obj = new para();
        Scanner in = new Scanner(System.in);    
        System.out.print("Enter para: "); 
  		
  		String pg = in.nextLine();  
        StringTokenizer str = new StringTokenizer(pg,".?!");         
        int count = str.countTokens();    
                 
        if(count > 10)
        	System.out.println("Max 10 sentences are allowed!");
        
        else {
            
            String sent[] = new String[count];
            int p[] = new int[count]; 
             
            for(int i = 0 ; i < count ; i++) {
                sent[i] = str.nextToken().trim(); 
                p[i] = obj.countWords(sent[i]); 
            }

            obj.sort(sent,p);
        }
    }
}