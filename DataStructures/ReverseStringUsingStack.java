package DataStructures;

import java.util.ArrayList;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String string = "gninraeL nIdekniL htiw tol a nraeL";
        
        // convert string to char array
        char[] charArray = string.toCharArray();

        Stack stack = new Stack();
        for (int i = 0; i < string.length(); i++) {
            stack.push(charArray[i]);
        }   

        ArrayList<Integer> r = new ArrayList<Integer>();
        while(! stack.isEmpty()) {
            r.add(stack.pop());
        }

        // converting ArrayList of integers to ArrayList of characters
        ArrayList<Character> c = new ArrayList<Character>();
        for (int i: r) {
            c.add((char)i);
        }

        // converting ArrayList of integers to ArrayList of Strings
        ArrayList<String> s = new ArrayList<String>();
        for (char i: c) {
            s.add(Character.toString(i));
        }

        // converting ArrayList of strings to string
        System.out.println(String.join("", s));
        
    }
}
