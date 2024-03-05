package day50;

public enum AkAccountType {
    GOLD(80, 70, 1.3),
    SAVING(90, 60, 1.2),
    INTEREST(100, 50, 1.1);
    private final double depositBonus;
    private final double withdrawExpenses;
    private final double returnRate;

    AkAccountType(double depositBonus, double withdrawExpenses, double returnRate) {
        this.depositBonus = depositBonus;
        this.withdrawExpenses = withdrawExpenses;
        this.returnRate = returnRate;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public double getWithdrawExpenses() {
        return withdrawExpenses;
    }

    public double getReturnRate() {
        return returnRate;
    }
}
