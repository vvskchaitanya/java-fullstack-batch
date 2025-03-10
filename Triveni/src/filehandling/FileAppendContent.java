package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppendContent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name to add the content...");
        String fileName = sc.next();

        if(fileName.indexOf(".txt") == -1)
            fileName += ".txt";

        File file = new File(fileName);
        sc.nextLine();
        System.out.println("Enter the content to add: ");
        String content = sc.nextLine();

        try(FileWriter writer = new FileWriter(file,true)){
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Unable to write to the file.."+fileName);
        }

        System.out.println("Sucessfully appended content to file....");
        sc.close();
        }
    }


