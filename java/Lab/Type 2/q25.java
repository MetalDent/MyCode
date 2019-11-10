//write string to file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class q25 {
    
    public static void main(String[] args) {    
        try {
            File file = new File("new.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This is ");
            fileWriter.write("a test");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}