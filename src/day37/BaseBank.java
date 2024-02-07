package day37;

public class BaseBank {

    int accountNumber;
    String accountName;
    String accountType;
    String currency;
    boolean isActive;
    double currentBalance;

    public BaseBank(){

    }

    public BaseBank(int accountNumber, String accountName, String accountType,
                    String currency, boolean isActive, double currentBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.currency = currency;
        this.isActive = isActive;
        this.currentBalance = currentBalance;
    }

    public void withdraw(double withdraw){
        currentBalance -= withdraw;
    }

    public void deposit (double deposit){
        currentBalance += deposit;
    }
}
