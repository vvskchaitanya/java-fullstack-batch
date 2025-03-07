package com.fullstack.java.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrtierAppendExample {
    public static void main(String[] args) {
        // Create Scanner to read the file name and file content from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("File Writer Appending the data Example: ");
        System.out.print("Enter the name of the file: ");
        String name = sc.next();

        // Create new file
        File file = new File(name);

        // Clearing the extra new line character from last input
        sc.nextLine();

        System.out.println("Enter the content of the file: ");

        String content = sc.nextLine();

        // Initialize the FileWriter class using try with resource syntax

        try (FileWriter writer = new FileWriter(file,true)){
            
            // Write the content using FileWriter.write method
            writer.write(content);
            
        } catch (IOException e) {
            System.out.println("Unable to write to new file "+ name);
            e.printStackTrace();
        }

        System.out.println("Successfully write content to file "+file.getAbsolutePath());

        sc.close();

    }
}
