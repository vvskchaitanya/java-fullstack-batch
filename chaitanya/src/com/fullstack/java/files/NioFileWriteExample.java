package com.fullstack.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/** Demonstrate a java program to read the file using java.nio */

public class NioFileWriteExample {

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

        Path newPath = Paths.get(name);

        // Clearing the extra new line character from last input
        sc.nextLine();

        System.out.println("Enter the content of the file: ");

        String content = sc.nextLine();

        try{


            Files.write(newPath, content.getBytes());

            System.out.println("File has been written");
        }catch(IOException ioe){
            System.out.println("Unable to write to the file");
        }

        


    }
}
