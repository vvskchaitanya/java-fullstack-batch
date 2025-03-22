package filehandling;

import java.io.File;

import java.util.Scanner;

public class FileDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name to delete: ");
        String fileName = sc.next();

        if (fileName.indexOf(".txt") == -1)
            fileName += ".txt";

        File file = new File(fileName);

        if (file.exists()) {
            file.delete();
            System.out.println(fileName + " is deleted successfully");
        } else {
            System.out.println("Unable to delete the file..." + fileName);
        }
        sc.close();

    }
}
