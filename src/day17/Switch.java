package day17;

public class Switch {
    public static void main(String[] args) {
        int number = 7;
//        boolean result = true; type of 'boolean' is not supported

        switch (number) {
            case 5:
                System.out.println("Five");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("couldnt find");
        }

        String city = "Oslo";
        String country = "";
        long l = 123456778l;
        // double, float, long not supported by switch
        switch (city) {
            case "London":
                System.out.println("Capital of UK");
                country = "UK";
                break;
            case "Ankara":
                System.out.println("Capital of Turkey");
                country = "Turkey";
                break;
            case "Oslo":
                System.out.println("Capital of Norway");
                country = "Norway";
        }
        double d = 15.55;
//        switch (d) {Selector type of 'double' is not supported
        switch ((int) d) {
            case 10:
            case 15:
                System.out.println("d = " + d);
                break;
            case 20:

        }


    }
}
