package day58;

import java.util.Stack;

public class StackSample {

    public static void main(String[] args) {

        Stack<Character> stackList = new Stack<>();   // LIFO!!!

        stackList.add('R');
        stackList.add('a');
        stackList.add('b');
        stackList.add('b');
        stackList.add('i');
        System.out.println("stackList = " + stackList);

        stackList.push('t');
        System.out.println("stackList = " + stackList);

        System.out.println("stackList.pop() = " + stackList.pop()); // will return the last added object and REMOVE IT
        System.out.println("stackList = " + stackList);

        System.out.println("stackList.peek() = " + stackList.peek());// will only return last add object, will NOT remove it!!
        System.out.println("stackList = " + stackList);

    }
}
