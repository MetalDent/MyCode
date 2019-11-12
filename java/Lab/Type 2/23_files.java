import java.io.File;
import java.io.FilenameFilter;
 
class files {
 
    public static void main(String a[]){
        File file = new File("../Type 2");
        String[] files = file.list(new FilenameFilter() {
             
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".csv")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
}