package day21;

public class Methods_1 {
    public static void main(String[] args) {

//        printName();
        System.out.println(greetingName("Faruk"));
        String name = "Ali";
        System.out.println(greetingName(name));
        String greetingMarry = greetingName("Marry");//Hello Marry
        System.out.println("greetingMarry = " + greetingMarry);

    }
    //create a method with 1 parameter(String -name)
    //will return Hello + name

    static String greetingName(String name) {

//        "Hello"+"Ali"
        return "Hello " + name;
    }

    //     printName() {Invalid method declaration; return type required
    static void printName() {
        System.out.println("Ali");
    }


}
