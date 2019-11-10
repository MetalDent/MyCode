//get all file lists from folder
import java.io.File;
 
public class q21 {
     
    public static void main(String a[]){
        File file = new File("mod2");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}