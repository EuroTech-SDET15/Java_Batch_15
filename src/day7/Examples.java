package day7;

public class Examples {

    public static void main(String[] args) {

        int number = 10;
//                                       (3*3)+1
        System.out.println(number % 3);//remaining value after division

        System.out.println(number % 4);

        int result = 2 + 5 * 4 / 2 - 1;
        //           2    20 /  2 - 1
        //           2  +    10    - 1
        //           11
        System.out.println(2 + 5 * 4 / 2 - 1);
        System.out.println(result);

        //unary operator
        // increment-decrement
        //    ++       --
        // pre increment post increment  & pre decrement post decrement

        result = 10;
        System.out.println(++result);
        System.out.println(result++);//12
        int n = result;
        System.out.println("n = " + n);//12
        n++;// 13
        ++n;//14
        System.out.println("n = " + n);//14

        int x = n++;
        System.out.println("x = " + x);
        System.out.println("n = " + n);


        x = 10;
        result = ++x + x++;
        //        11    11
        System.out.println("result = " + result);
        System.out.println("x = " + x);//12

        result = 10;
        result++;
        result++;
        System.out.println("result = " + result);
        result = 10;
        --result;//9
        result--;//8
        System.out.println("result = " + result);//8


        result = 10;
        result = result + 20;
        //          10  + 20   ==>30
        System.out.println("result = " + result);
        result = result + result;
        //        30        30
        System.out.println("result = " + result);


        int a = 20;
        int b = 30;
        int c = 40;
        result = a + b + c;
        //       20 30  40 -->90
        a = result - a - b;
  //         90      20  30 -->40
        b = result - a - b;
     //      90      40 - 30  --->20
        System.out.println("result = " + result);// 90
        System.out.println("a = " + a);//  40
        System.out.println("b = " + b);//  20
        System.out.println("c = " + c);//  40


    }


}
