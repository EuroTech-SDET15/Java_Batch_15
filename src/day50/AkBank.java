package day50;

public class AkBank extends CentralBank {


    public AkBank(String accountType, double currentBalance) {
        super("AkBank", accountType, currentBalance, 120);
        initAccountValues(AkAccountType.GOLD.getDepositBonus(), 70,1.3,
                90,60,1.2,
                100,50,1.1);

                // TODO TASK-2 try to make this switch more dynamic like only do initialize in parent  etc..
                // TODO TASK-3 user must continue program with valid account name... so do related updates

    }

    @Override
    public void deposit(double depositValue) {
        if (depositValue < 0) {
            System.out.println("INVALID Deposit Value, Transaction cancelled");
            // TODO-5 Give user 3 chance to re enter deposit value. after next valid value
            // don't forget to add bonus!!!
        } else if (depositValue >= 2000) {
            // I need to add deposit bonus before send to parent deposit method!
            super.deposit(depositValue + getDepositBonus());
        } else {
            super.deposit(depositValue);
        }
    }

    @Override
    public void withdraw(double withdrawValue) {
        if (withdrawValue < 0 || withdrawValue > getCurrentBalance() + getWithdrawExpense()) {
            System.out.println("INVALID withdraw Value, Transaction cancelled");
            // TODO-6 Give user 3 chance to re enter withdraw value. after next valid value

        } else if (withdrawValue >= 1000) {
            // I need to reduce withdraw expense before send to parent withdraw method!
            super.withdraw(withdrawValue + getWithdrawExpense());
        } else {
            super.withdraw(withdrawValue);
        }
    }

    @Override
    public void printPolicyDocument() {
        System.out.println("AKBANK POLICY: blablablablablablabl");
    }
}