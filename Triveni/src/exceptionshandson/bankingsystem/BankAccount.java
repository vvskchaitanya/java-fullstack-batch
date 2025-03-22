package exceptionshandson.bankingsystem;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double deposit(double amount){
        this.balance += amount;
        System.out.println(this.name+", your balance after deposit of amount "+amount+" is "+this.balance);
        return balance;
    }
    public void withdraw(double amount) throws InsuffiecientFundsException{
        if(this.balance < amount){
            throw new InsuffiecientFundsException(this.name+", you do not enough funds to withdraw");
        }
        else{
            this.balance -= amount;
            System.out.println(this.name+", your balance after withdraw of amount "+amount+" is "+this.balance);
        }
    }

    

}
