package day54;

public class Add {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    //    public int add(int a, int b, int c) {
//        System.out.println(a + b + c);
//        return a+b;
//    }
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public int add(int... numbers) {
        System.out.println(numbers[0]);
        int result = 0;
        for (int n : numbers) {
//            result = result + n;
            result += n;
        }
        return result;
    }


    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void multiply(int[] nums) {
        int x = 1;
        for (int n : nums) {
            x = x * n;
        }
        System.out.println("x = " + x);
    }
}

class Test {
    public static void main(String[] args) {
        Add operation = new Add();
        operation.add(10, 20);
        operation.add(10, 20, 30);
        System.out.println(operation.add(10, 20, 30, 40, 50, 60));
        operation.add(9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4);
        operation.multiply(new int[]{1, 2, 3, 4, 5, 6});
        operation.multiply(new int[]{10, 2, 3, 40, 5, 6, 7, 8, 9});
    }
}

class Multiply {


}
