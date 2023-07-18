//5. Write a program for copying the file using streams.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Program5 {
    public static void main(String[] args) {
        try{
            FileInputStream f1 = new FileInputStream(new File("file1.txt"));
            FileOutputStream f2 = new FileOutputStream(new File("file2.txt"));

            int x;
            while ((x = f1.read()) != -1)
                f2.write(x);

            System.out.println("File Copied");
            f1.close();
            f2.close();
        }

        catch (FileNotFoundException ex){
            System.out.println(ex);
        }

        catch (IOException ex){
            System.out.println(ex);
        }
        
        
        
    }
}