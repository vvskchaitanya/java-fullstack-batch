package exceptionshandson;

import java.util.Scanner;

public class MultipleCustomExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check eligibility../ exit");

        while (true) {
        try {
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                    System.out.println("EXiting the program.....");
                    break;
                }
                int age = Integer.parseInt(input);
                checkAge(age);
                }catch (InvalidAgeException e) {
                    System.out.println("Your Age is " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input, please enter int value for age");
                }
            }
            sc.close();
        }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("Age is Valid to vote...");
        } else {
            throw new InvalidAgeException("Not eligible to vote");
        }
    }

}
