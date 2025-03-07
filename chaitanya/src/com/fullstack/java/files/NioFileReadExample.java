package com.fullstack.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/** Demonstrate a java program to read the file using java.nio */

public class NioFileReadExample {

    public static void main(String[] args) {
        // Create Scanner to read the file name and file content from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("File Reader Example: ");
        System.out.print("Enter the name of the file: ");
        String name = sc.next();

        Path newPath = Paths.get(name);

        try{


            List<String> lines = Files.readAllLines(newPath);

            System.out.println("Reading the file "+name);

            lines.forEach(System.out::println);
            
        }catch(IOException ioe){
            System.out.println("Unable to read the file");
        }

        


    }
}
