package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter file name: "));
        String fileName = sc.next();

        if(fileName.indexOf(".txt") == -1)
            fileName += ".txt";
        
        String output = "";
        File file = new File(fileName);
        FileReader reader = null;
        try {
            
            reader = new FileReader(file);
            try {
                int c = reader.read();
                System.out.println("Reading file:" + fileName);
                while(c != -1){
                    output += (char) c;
                    c= reader.read();
                }
                System.out.println("File Content......\n"+output);
            } catch (IOException e) {
                System.out.println("Unable to read the file "+fileName);
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to find the file "+fileName);
            
        }
        finally{
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Unable to close the file: "+fileName);
                e.printStackTrace();
            }
            sc.close();
        }
        
    }
}
