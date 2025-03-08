package exceptionshandson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        int num1 = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to divide.");
        

        try {
            int num2 = sc.nextInt();
            int res = num1/num2;
            System.out.println("Division of "+num1+" and "+num2+" is "+res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide the numner by 0 "+e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Invalid Input, please enter a int value.");
        }
        finally{
            System.out.println("End of the program....");// This statement/block is executed irrespective of exception occurs or not.
            sc.close();
        }
        
    }

}
