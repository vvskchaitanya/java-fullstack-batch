package exceptionshandson.bankingsystem;

public class InsuffiecientFundsException extends Exception{
    public InsuffiecientFundsException(String message){
        super(message);
    }

}
