package day42;

public class DriverTest {

    public static void main(String[] args) {

        Driver driver1= new Driver();
//        driver1.driverCount++;
        driver1.name = "Hasna";
        driver1.surname = "Jackson";
        driver1.licenceNumber = 1000001;

        System.out.println("driver1.driverCount = " + driver1.driverCount);
        System.out.println("Driver.driverCount = " + Driver.driverCount); // 1
        driver1.printDriverFullName();
//--------------------------------------------------
        Driver driver2= new Driver();
//        Driver.driverCount ++;
        driver2.name = "Sarita";
        driver2.surname = "Max";
        driver2.licenceNumber = 1000002;

        System.out.println("driver2.driverCount = " + driver2.driverCount);
        System.out.println("Driver.driverCount = " + Driver.driverCount);  // 2

        System.out.println("driver1.licenceNumber = " + driver1.licenceNumber);
        System.out.println("driver2.licenceNumber = " + driver2.licenceNumber);
        driver2.printDriverFullName();
//--------------------------------------------------
        Driver driver3= new Driver();
//        Driver.driverCount ++;
        driver3.name = "Filiz";
        driver3.surname = "Gul";
        driver3.licenceNumber = 1000003;

        System.out.println("driver3.driverCount = " + driver3.driverCount);
        System.out.println("Driver.driverCount = " + Driver.driverCount);  // 3
//--------------------------------------------------
        Driver driver4= new Driver();
//        Driver.driverCount ++;
        driver4.name = "Sneha";
        driver4.surname = "Chen";
        driver4.licenceNumber = 1000004;
        System.out.println("driver4.driverCount = " + driver4.driverCount);
        System.out.println("Driver.driverCount = " + Driver.driverCount);  // 4
    }
}
