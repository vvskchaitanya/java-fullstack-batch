package com.fullstack.java.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrate a java program to create new file using java.io.File
 */
public class FileCreationExample {

    public static void main(String[] args) {
        // Create a file with name

        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("File Creation Example: ");
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

        sc.close();


    }
}
