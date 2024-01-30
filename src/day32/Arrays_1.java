package day32;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        String str = "Cevahir Filiz Gulay Hasna Rosana Sarita Sneha";
//        System.out.println(str.indexOf(" "));
//        System.out.println(str.substring(0, 7));
//        str = str.substring(8);
//        System.out.println(str);
//        System.out.println(str.indexOf(" "));
//        System.out.println(str.substring(0, 5));

//        "Cevahir Filiz Gulay Hasna Rosana Sarita Sneha";
        //          0     1     2     3     4      5      6
        String[] names = str.split(" ");

        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);
        System.out.println(names[6]);
        str = "Cevahir, Filiz, Gulay, Hasna, Rosana, Sarita, Sneha";
        String[] ladies = str.split(",");
        System.out.println(ladies.length);
        System.out.println(ladies[0]);
        System.out.println(ladies[1]);
        System.out.println(ladies[2]);
        System.out.println(Arrays.toString(ladies));
        str = "Messi and Ronaldo are playing football";

        String[] players = str.split(" ");
        System.out.println(players[2]);
        String player = "Ronaldo";
        players = str.split("and ");
        System.out.println(players[1]);
        System.out.println(players[1].substring(0, 7));
        System.out.println(players[1].substring(0, player.length()));

        str = "Messi and Ronaldo are playing football";
        //       0    1    2           3
       players = str.split(" ",4);
        System.out.println(Arrays.toString(players));


    }
}
