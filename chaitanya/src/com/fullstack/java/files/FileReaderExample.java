package com.fullstack.java.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrate a java program to read an existing the file and print the content of the file to console
 */
public class FileReaderExample {
    public static void main(String[] args) {
        // Create Scanner to read the file name

        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("File Reader Example: ");
        System.out.print("Enter the name of the file: ");
        String name = sc.next();

        // Create new file object for existing file
        File file = new File(name);

        try(FileReader reader=new FileReader(file)){
            int c = reader.read();
            System.out.println("Reading File :"+name);

            // EOF is End of File Character which -1
            while(c!=-1){

                System.out.print((char)c);

                c = reader.read();
            }

        }catch(IOException ioe){
            System.out.println("Unable to read the file "+name);
        }


    }
}
