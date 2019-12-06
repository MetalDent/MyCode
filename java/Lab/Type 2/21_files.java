import java.io.File;
 
class files {
     
    public static void main(String a[]){
        File file = new File("../Type 2");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
