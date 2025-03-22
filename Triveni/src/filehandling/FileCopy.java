package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source file name: ");
        String in = sc.next();
        System.out.println("ENter the destination file name: ");
        String out = sc.next();

        if(in.indexOf(".txt") == -1){
            in += ".txt";
        }
        if(out.indexOf(".txt") == -1){
            out += ".txt";
        }
        try (FileReader reader = new FileReader(in);
             FileWriter writer = new FileWriter(out)) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());
        }
        sc.close();
    }

}
