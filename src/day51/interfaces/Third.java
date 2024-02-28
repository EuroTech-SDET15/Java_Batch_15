package day51.interfaces;

public class Third {
    public static void main(String[] args) {
//        B b = new B();'B' is abstract; cannot be instantiated
        C c = new C();
        c.write();
//        B.city = "Madrid";Cannot assign a value to final variable 'city
        System.out.println("B.city = " + B.city);
        System.out.println("B.number = " + B.number);

        System.out.println("C.city = " + C.city);
        System.out.println("C.number = " + C.number);
        System.out.println("B.companyName = " + B.companyName);
        String actualCity = "London";
//        String expectedCity = "Oslo";
        String expectedCity = Storage.city;
        System.out.println(actualCity.equals(Storage.city));
        System.out.println("actualCity.equals(expectedCity) = " + actualCity.equals(expectedCity));


    }
}
