package day50;

public class BankTEST {

    public static void main(String[] args) {
        // TODO TASK-4 Each bank will give bonus money to their 5th customer!!!

//        CentralBank saving1= new CentralBank();

        AkBank saving1 = new AkBank("Saving", 1000);
        System.out.println("saving1.accountType = " + saving1.getAccountType());
        System.out.println("saving1.currentBalance = " + saving1.getCurrentBalance());
        System.out.println("saving1.depositBonus = " + saving1.getDepositBonus());
        // TODO TASK-1 Try to make setDepositBonus method unreachable for child objects!!!

        saving1.deposit(2000);
        saving1.deposit(1000);
        saving1.deposit(-1000);

        saving1.withdraw(2000);
        saving1.withdraw(500);
        saving1.withdraw(-500);

        saving1.closeAccount();
        System.out.println("saving1.getCurrentBalance() = " + saving1.getCurrentBalance());
        System.out.println("saving1.getFinalBalance() = " + saving1.getFinalBalance());

        // TODO-9 Create a sample for Karabank. Close account from kara bank and with its final balance
        // open a new account in akbank!!

    }
}
