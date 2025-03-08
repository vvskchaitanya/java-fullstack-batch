package filehandling;

import java.io.File;
import java.util.Scanner;

public class FileExists {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter file name: "));
        String fileName = sc.next();

        if(fileName.indexOf(".txt") == -1)
            fileName += ".txt";
        
        File file = new File(fileName);
        System.out.println("File with "+fileName+" "+(file.exists()?"esists":"does not exist"));
        sc.close();
        }
       
    }     
    

