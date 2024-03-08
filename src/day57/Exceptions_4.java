package day57;

public class Exceptions_4 {
    public static void main(String[] args) {
//        String str = null;
//        System.out.println("str = " + str.length());
//        str.charAt(0);
//        char a = str.charAt(10);
//        System.out.println("a = " + a);
        //StringIndexOutOfBoundsException
        //NullPointerException
        print("Hi");
    }

    public static void print(String str) {
        try {
//            System.out.println("str.charAt(10) = " + str.charAt(10));
            System.out.println("str = " + str.charAt(10));
        } catch (NullPointerException |StringIndexOutOfBoundsException s) {
            s.printStackTrace();
//        } catch (StringIndexOutOfBoundsException s) {
//            System.out.println("s = " + s);
//        } catch (Exception e) {
//            e.printStackTrace();
        }finally {
            System.out.println("This will be executed all the time!!!");
        }

    }

}
