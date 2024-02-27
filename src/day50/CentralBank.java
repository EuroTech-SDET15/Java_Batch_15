package day50;

public abstract class CentralBank {
    final private String bankName;
    final private String accountType; // GOLD, SAVING, INTEREST

    private double currentBalance;
    private double finalBalance;

    final private double welcomeMoney;

    private double depositBonus;
    private double withdrawExpense;
    private double returnRate;

    private boolean isAccountClose = true;

    public CentralBank(String bankName, String accountType,
                       double currentBalance, double welcomeMoney) {
        System.out.println("/////**** Welcome to the "+bankName+" ****//////");
        this.bankName = bankName;
        this.accountType = accountType;
        this.currentBalance = currentBalance + welcomeMoney;
        this.welcomeMoney = welcomeMoney;
        this.isAccountClose = false;
        System.out.println("Your "+accountType+ " account is created, and your current balance is "+this.currentBalance);
    }

    //////////////// GETTERs \\\\\\\\\\\\\\\\\
    public String getBankName() {
        return bankName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public double getWelcomeMoney() {
        return welcomeMoney;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public double getWithdrawExpense() {
        return withdrawExpense;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public boolean isAccountClose() {
        return isAccountClose;
    }

    //////////////// SETTERs \\\\\\\\\\\\\\\\\
    protected void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public void setWithdrawExpense(double withdrawExpense) {
        this.withdrawExpense = withdrawExpense;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    //////////////// FUNCTIONs \\\\\\\\\\\\\\\\\

    public void deposit(double depositValue) {
        this.currentBalance += depositValue;
        System.out.println(depositValue + " deposit value add to your balance.\n Current balance is " + getCurrentBalance());
    }


    public void withdraw(double withdrawValue) {
        this.currentBalance -= withdrawValue;
        System.out.println(withdrawValue + " withdraw value reduced from your balance.\n Current balance is " + getCurrentBalance());
    }


    public void closeAccount(){
        // TODO-7 Try to ask customer again, are you sure , YES NO
        if(!isAccountClose) {
            finalBalance = currentBalance * getReturnRate();
            currentBalance = 0;
            System.out.println("Your finalBalance is = " + finalBalance);
            System.out.println("ACCOUNT IS CLOSED!!!");
            isAccountClose = true;
        } else{
            System.out.println("ACCOUNT is already CLOSED!!! ");
        }
    }

    public abstract void printPolicyDocument();

    // TODO-8 Try to add abstract method. ie  policy


}
