package com.fullstack.java.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrate a java program with file write example
 */
public class FileWriterExample {

    public static void main(String[] args) {
        // Create Scanner to read the file name and file content from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("File Writer Example: ");
        System.out.print("Enter the name of the file: ");
        String name = sc.next();

        if(name.indexOf(".txt")==-1){
            name += ".txt";
        }

        // Create new file
        File file = new File(name);

        try {

            System.out.println("Creating new file "+ name);
            file.createNewFile();

            System.out.println("Created new file "+ name +" path is "+file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Unable to create the new file "+ name);
            e.printStackTrace();
        }

        // Clearing the extra new line character from last input
        sc.nextLine();

        System.out.println("Enter the content of the file: ");

        String content = sc.nextLine();

        // Initialize the FileWriter class using try with resource syntax

        try (FileWriter writer = new FileWriter(file)){
            
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
