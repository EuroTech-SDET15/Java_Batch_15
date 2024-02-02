package day35;

import java.util.Arrays;

public class Scores {
    public static void main(String[] args) {
        String[] scores = {"Bulls Newyork : 100-90", "Orlando NewJersey : 118-87",
                "Toronto NewOrleans : 120-115", "Washington Detroits : 94-80"
        };
        int[] lastNumbers = new int[8];
        String str = "Bulls Newyork : 100-90";
        //              0           :  1
        String[] splittedString = str.split(":");
        System.out.println(splittedString[1]);
        String matchScore = splittedString[1];
//        100-90
//         0 - 1
        String[] lastScores = matchScore.split("-");
        System.out.println(lastScores[0]);
        System.out.println(lastScores[1]);
        String firstVal = lastScores[0];//-- > string
        String secondVal = lastScores[1];//-- > string
        int first = Integer.parseInt(firstVal.trim());
        int second = Integer.parseInt(secondVal);
        System.out.println("first " + first);
        System.out.println("second " + second);

        //  "Bulls Newyork : 100-90";
        //    0                 1
        //                    0  -
        first = Integer.parseInt(str.split(":")[1].split("-")[0].trim());
        System.out.println(first);
        //  "Bulls Newyork : 100-90";
        //        0        : 1  - 2
        String[] split = str.split("[:-]");
        System.out.println(Arrays.toString(split));
        int num = Integer.valueOf(split[1].trim());

        str = "David,Messi is playing:football";
//
        String[] split1 = str.split("[, :]");
        System.out.println(Arrays.toString(split1));
        str = "David. played. football";
        String[] split2 = str.split("\\.");
        System.out.println(Arrays.toString(split2));
    }
}
