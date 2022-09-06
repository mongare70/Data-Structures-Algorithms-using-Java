package DataStructures;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> items = new LinkedList<Integer>();

    // check whether the queue is empty or not
    public boolean isEmpty(){
        return this.items.size() == 0;
    }

    // add items at the rear
    public void enqueue(int item) {
        this.items.addFirst(item);;
    }

    // remove items at the front
    public int dequeue() {
        return this.items.removeLast();
    }

    // check the size of the queue
    public int size() {
        return this.items.size();
    }

    public void print() {
        System.out.println(this.items);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println("The size of the queue is: " + queue.size());
        queue.dequeue();
        queue.print();
        System.out.println("The size of the queue is: " + queue.size());
    }

}
