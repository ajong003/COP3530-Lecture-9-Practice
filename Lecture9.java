import java.util.concurrent.atomic.AtomicBoolean;
 

// A class to store a binary tree node
class Node
{
    int data;
    Node left = null, right = null;
 
    Node(int data) {
        this.data = data;
    }
}
 
public class Lecture9
{
    // Recursive function to check if a given binary tree is height-balanced or not
    public static int isHeightBalanced(Node root, AtomicBoolean isBalanced)
    {
        //TODO

        return -1;
    }
 
    // The main function to check if a given binary tree is height-balanced or not
    public static boolean isHeightBalanced(Node root)
    {
        // use `AtomicBoolean` to get the result since `Boolean` is passed by value
        // in Java
        AtomicBoolean isBalanced = new AtomicBoolean(true);
        isHeightBalanced(root, isBalanced);
 
        return isBalanced.get();
    }
 
    public static void main(String[] args)
    {
        /* Construct the following tree
                  1
                /   \
               /     \
              2       3
             / \     /
            4   5   6
        */
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
 
        if (isHeightBalanced(root)) {
            System.out.println("Binary tree is balanced");
        }
        else {
            System.out.println("Binary tree is not balanced");
        }
    }
}