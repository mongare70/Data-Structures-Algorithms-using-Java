package DataStructures.LinkedList;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    public static int countNodes(Node head) {
        int count = 1;
        Node current = head;

        while (current.next != null) {
            current = current.next;
            count = count + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println("This linked list's length is: " + countNodes(nodeA));
        
    }

}
