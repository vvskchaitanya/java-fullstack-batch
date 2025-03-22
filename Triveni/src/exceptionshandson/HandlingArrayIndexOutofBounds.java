package exceptionshandson;

import java.util.Scanner;

public class HandlingArrayIndexOutofBounds {
    public static void main(String[] args) {

        int[] arr = { 2, 5, 6, 33, 22, 77, 854, 234, 56 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = sc.nextInt();

        try {
            int value = arr[index];
            System.out.println("The element at index " + index + " is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index "+index+" is out of bounds for array");
            System.out.println("Enter a valid index between 0 to "+(arr.length-1));

        }
        sc.close();

    }

}
