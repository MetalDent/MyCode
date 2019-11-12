import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class string_file {
    
    public static void main(String[] args) {    
        try {
            File file = new File("new.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello World ");
            fileWriter.write("'Sup?");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}