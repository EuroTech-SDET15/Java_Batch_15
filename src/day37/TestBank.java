package day37;

public class TestBank {

    public static void main(String[] args) {

        BaseBank customer1;
        customer1 = new BaseBank();
        customer1.accountNumber = 1001;
        customer1.accountName = "My Gold account";
        customer1.accountType = "gold";
        customer1.currency = "gr";
        customer1.isActive = true;
        customer1.currentBalance = 100;


        BaseBank customer2 = new BaseBank();
        customer2.accountNumber = 1002;
        customer2.accountName = "My Euro Interestaccount";
        customer2.accountType = "interest";
        customer2.currency = "euro";
        customer2.isActive = true;
        customer2.currentBalance = 10000;


        BaseBank customer3 = new BaseBank(1003, "Dolar Account",
                "Saving", "USDolar", true, 1000);

        System.out.println("customer3.accountNumber = " + customer3.accountNumber);

    }
}
