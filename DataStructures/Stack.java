package DataStructures;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> items = new ArrayList<Integer>();

    // Check whether the stack is empty or not
    public boolean isEmpty() {
        return this.items.size() == 0;
    }

    // push an item into the stack
    public void push(int item) {
        this.items.add(item);
    }

    // remove the last item from the stack
    public int pop() {
        return this.items.remove(items.size() - 1);
    }

    // return the last item in the stack
    public int peek() {
        return this.items.get(items.size() - 1);
    }

    // return the size of the stack
    public int size() {
        return this.items.size();
    }

    public void print() {
        System.out.println(this.items);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(4);
        stack.print();
        stack.push(5);
        stack.push(6);
        stack.print();
        stack.pop();
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
