package day41;

public class AccountTest {
    public static void main(String[] args) {
        AccountHolder accountHolder1 = new AccountHolder(5000);
        accountHolder1.setName("Henry");
        accountHolder1.setBirthYear(1991);//33  2024-birthYear
        System.out.println(accountHolder1.getBalance());

        // AccountHolder

        //while creating object get birthyear and calculate age


        AccountHolder accountHolder2 = new AccountHolder(10000);

        // accountHolder2.getAge();
        System.out.println("accountHolder1.getAge() = " + accountHolder1.getAge());
        accountHolder2.setName("Marry");
        System.out.println("accountHolder2.getBalance() = " + accountHolder2.getBalance());
        accountHolder2.setBirthYear(1999);
        System.out.println("accountHolder2.getAge() = " + accountHolder2.getAge());
        accountHolder1.setCity("Hamburg");
        accountHolder2.setCity("Paris");

        accountHolder1.putMoneyIntoAccount(3000);
        System.out.println("accountHolder1.getBalance() = " + accountHolder1.getBalance());//8000

        accountHolder2.putMoneyIntoAccount(5000);
        System.out.println("accountHolder2.getBalance() = " + accountHolder2.getBalance());//15000

        accountHolder2.withdrawMoney(2000);
        System.out.println("accountHolder2.getBalance() = " + accountHolder2.getBalance());//13000


    }
}
