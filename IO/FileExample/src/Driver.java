import java.io.File;
import java.io.IOException;

public class Driver {  
    public static void main(String[] args) {  
  
        try {  
            File file = new File("output.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  