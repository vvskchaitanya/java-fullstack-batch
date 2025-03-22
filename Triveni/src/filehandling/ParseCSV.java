package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseCSV {
    public static void main(String[] args) {
        String filePath = "person.csv";
        List<Person> people = readCSV(filePath);

        if (people != null) {
            for (Person person : people) {
                System.out.println(person);
            }
        }
        else{
            System.out.println("No people found or an error occured while parsing....");
        }
    }
    public static List<Person> readCSV(String filePath) {
        List<Person> personList = new ArrayList<>();
        File file = new File(filePath);

        System.out.println("file path: "+file.getAbsolutePath()); // gets the csv file path
        try (Scanner scanner = new Scanner(file)) {
            scanner.nextLine(); // to skip first line
            while (scanner.hasNextLine()) {
                
                String line = scanner.nextLine(); 
                String[] data = line.split(",");

                try {
                    if (data.length == 3) { 
                        String name = data[0].trim();
                        int age = Integer.parseInt(data[1].trim());
                        String email = data[2].trim();
                        personList.add(new Person(name, age, email));
                    } else {
                        System.out.println("Skipping invalid line: " + line);// adding extra field in 20 line of csv file
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Unable to parse age: " + data[1] + " in line: " + line);// kept string in age in last line of csv file 
                } catch (Exception e) {
                    System.out.println("Error processing line: " + line + " - " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            return null;
        }
        return personList;
    }

}
