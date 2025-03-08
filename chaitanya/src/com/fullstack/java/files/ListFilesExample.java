package com.fullstack.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/** Demonstrate a program to list all files in a folder using java.nio.Files */
public class ListFilesExample {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the folder path: ");

        String folder = sc.next();

        Path folderPath = Paths.get(folder);

        try {
            Files.walk(folderPath).forEach(file->{
                System.out.println(file);
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
