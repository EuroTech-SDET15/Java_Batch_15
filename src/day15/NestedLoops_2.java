package day15;

public class NestedLoops_2 {
    public static void main(String[] args) {
//         1 1 1 1
//         2 2 2 2
//         3 3 3 3
//         4 4 4 4
//         5 5 5 5
        //there are 5 rows
        // there are 4 columns
        for (int i = 1; i <= 5; i++) {

            for (int n = 0; n < 4; n++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("out of the looppppsssss!!!");


        //break&continue

        //break  terminates(stops) execution of the block

        for (int i = 0; i < 5; i++) {
            System.out.println(i);//0 1 2
            if (i == 2) {
                break;
            }
        }

        System.out.println("out of the for looppp!!!");
        System.out.println("Continue!!!!!");
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.print(i);
// 0 1 2 4
        }


    }
}
