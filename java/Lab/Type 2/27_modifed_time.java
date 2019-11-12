import java.io.File;
import java.util.Date;

public class modified_time
 {
       public static void main(String[] args) {
       File file = new File("new.txt");
       Date date=new Date(file.lastModified());
	   System.out.println("\nThe file was last modified on: "+date+"\n");	   
     }
}
