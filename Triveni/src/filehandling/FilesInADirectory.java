package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesInADirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the directory path: ");

        String folder = sc.next();

        Path folderPath = Paths.get(folder);
        try{
            Files.walk(folderPath).forEach(file -> System.out.println(file));
        }catch(IOException e){
            System.out.println("Unable to get the files...");
        }
        sc.close();
    }

}
