package DataStructures.BinaryTree;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public static int findSum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + findSum(root.left) + findSum(root.right);
    }

    public static void main(String[] args) {
        
        // node2 is the root node
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node2.left = node3;
        node2.right = node4;
        node3.left = node5;
        node3.right = node6;

        System.out.println("The sum of values in the tree is: " + findSum(node2));
        
    }
    
}
