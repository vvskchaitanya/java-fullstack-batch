package exceptionshandson;

import java.util.Scanner;

public class HandlingArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for division....");
        System.out.println("Enter first number...");
        int num1 = sc.nextInt();
        System.out.println("Enter second number...");
        int num2 = sc.nextInt();
        int res =0;
        try {
            res = num1/num2;
            System.out.println("Division of "+num1+" and "+num2+" is: "+res);
        } catch (ArithmeticException e) {
            System.out.println("Unable to divide by 0 "+e.getMessage());
        }
        
        sc.close();

    }
}
