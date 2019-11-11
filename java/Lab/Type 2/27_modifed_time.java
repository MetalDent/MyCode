//get last modified time of file
import java.io.File;
import java.util.Date;

public class q27
 {
       public static void main(String[] args) {
       File file = new File("new.txt");
       Date date=new Date(file.lastModified());
	   System.out.println("\nThe file was last modified on: "+date+"\n");	   
     }
}
