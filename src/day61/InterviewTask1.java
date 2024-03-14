package day61;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewTask1 {

    public static void main(String[] args) {

        //
//        efficientJanitor(Arrays.asList(2.9f,1.99f,1.01f));
//        efficientJanitor(Arrays.asList(1.01f));
//        efficientJanitor(Arrays.asList(3f));
//        efficientJanitor(Arrays.asList(1.99f,1.01f));
//        efficientJanitor(Arrays.asList(2f,2f));
        efficientJanitor(Arrays.asList(2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f));
//        efficientJanitor(Arrays.asList(2.0f,1.99f,1.01f,1.01f)); // 3
        efficientJanitor(Arrays.asList(1.99f,1.99f,1.01f,1.01f)); // 2
        efficientJanitor(Arrays.asList(1.99f,1.99f,1.01f,1.01f,1.5f)); // 3
        efficientJanitor(Arrays.asList(2f, 1.01f)); //2
    }

    public static int efficientJanitor(List<Float> weight) {

        if (Collections.min(weight) > 1.5 ){
            System.out.println("trip = " + weight.size());
            return weight.size();
        } else if(weight.size()==1){ // as sample !!
            return 1;
        }

        Collections.sort(weight);
        System.out.println("weight = " + weight);

        int trip = 0;

        int left = 0; //represent to Min values
        int right = weight.size() - 1; //represent to Max values

        while (left <= right) {
            if (weight.get(left) + weight.get(right) <= 3) {
                left++;
            }
            trip++;
            right--;
        }

        System.out.println("trip = " + trip);

        return trip;
    }


}
