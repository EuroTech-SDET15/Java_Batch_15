package day61;

import java.util.*;

public class InterviewTask2 {

    public static void main(String[] args) {
        String[]input ={"A","A","B","B","C","D","A"};
//          String[]input ={"A","B","C","D","E"}; //  1
//        String[]input ={"A","A","A"}; //  3
//        String[]input ={"A","A","B","B","C","D"}; //  2
//        String[]input ={"A"}; //  1
//          String[]input ={"A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A"
//                  ,"A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A"};// size of A!!!


//        solution(input);
        solution2(input);
    }

   // String[]input ={"A","A",B","B","C","D","A"};

    public static int solution(String[]input){

    /* Array to list
       Find unique elements
       Then use frequency method to find repeat numbers
       Store them as a list, and return max number!
     */


        List<String> inputList = List.of(input);
        System.out.println("inputList = " + inputList);
        Set<String> inputSet = new TreeSet<>(inputList);
        System.out.println("inputSet = " + inputSet);

        if(inputSet.size()==1){
            return input.length;
        } else if (input.length == 1 || inputSet.size() == inputList.size()){
            return 1;
        }


        List<Integer> repeatNumbers = new ArrayList<>();
        // TODO you can create a map and return max repeated department
        Map<String,Integer> mapList= new TreeMap<>();

        for (String eachInput : inputSet) {
            repeatNumbers.add(Collections.frequency(inputList,eachInput));
            mapList.put(eachInput,Collections.frequency(inputList,eachInput));
        }

        System.out.println("repeatNumbers = " + repeatNumbers);
        System.out.println("mapList = " + mapList);
        System.out.println("Collections.max(repeatNumbers) = " + Collections.max(repeatNumbers));
        return Collections.max(repeatNumbers);
    }


    public static int solution2(String[]input){

        List<String> inputList = new ArrayList<>(List.of(input));
        Set<String> inputSet = new TreeSet<>(List.of(input));

        Map<String,Integer> inputMap= new TreeMap<>();

        for (String s : inputSet) {
            inputMap.put(s,Collections.frequency(inputList,s));
        }

        System.out.println("inputMap = " + inputMap);
        System.out.println("Collections.max(inputMap.values()) = " + Collections.max(inputMap.values()));
        return Collections.max(inputMap.values());
    }
}
