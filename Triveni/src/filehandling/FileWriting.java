package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter file name: "));
        String fileName = sc.next();

        if(fileName.indexOf(".txt") == -1)
            fileName += ".txt";
        
        File file = new File(fileName);

        // Creating new file
        try {
            System.out.println("Creating new file "+fileName);
            file.createNewFile();
            System.out.println("New file created...."+file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Unable to create new file..."+fileName);
            e.printStackTrace();
        }
        sc.nextLine();
        // writing content to the new file
        System.out.println("Enter the content of the file ");
        String content = sc.nextLine();

        try(FileWriter writer = new FileWriter(fileName)) {
            ;
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Unable to write content to the file..."+fileName);
            e.printStackTrace();
        }
        System.out.println("Successfully write content to the file "+file.getAbsolutePath());
        sc.close();
        
        
    }
}
