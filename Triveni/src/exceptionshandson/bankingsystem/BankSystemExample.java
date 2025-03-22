package exceptionshandson.bankingsystem;

public class BankSystemExample {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", 200);
        BankAccount acc2 = new BankAccount("Jay", 5000);
        acc.deposit(100);
        acc2.deposit(500);
        try{
            acc.withdraw(100);
            acc.withdraw(1000);
        }catch(InsuffiecientFundsException e){
            System.out.println(e.getMessage());
        }
        try{
            acc2.withdraw(2000);
        }catch(InsuffiecientFundsException e){
            System.out.println(e.getMessage());
        }
    }

}
