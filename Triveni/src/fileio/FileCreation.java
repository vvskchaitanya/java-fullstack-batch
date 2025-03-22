package fileio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter file name: "));
        String fileName = sc.next();

        if(fileName.indexOf(".txt") == -1)
            fileName += ".txt";
        
        File file = new File(fileName);
        
        try {
            System.out.println("Creating new File: "+fileName);
            file.createNewFile();
            System.out.println("Created new file"+fileName+" path is "+file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Unable to create new file "+fileName);
            e.printStackTrace();
        }
        
        sc.close();
    }
}