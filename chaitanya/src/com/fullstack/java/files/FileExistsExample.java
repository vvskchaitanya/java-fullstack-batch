package com.fullstack.java.files;

import java.io.File;
import java.util.Scanner;

public class FileExistsExample {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("File Exists Example: ");
        System.out.print("Enter the name of the file: ");
        String name = sc.next();

        File file = new File(name);

        boolean fileFound = file.exists();

        String out = "File "+name+ " " + (fileFound? "": "Not ")+"Found";

        System.out.println(out);

    }

}
