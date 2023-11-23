package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(scanner);
        // tree.Display();

        BinarySearchTree bst = new BinarySearchTree();
        // bst.insert(5);
        // bst.insert(6);
        // bst.insert(13);
        // bst.insert(69);
        // bst.insert(3);
        bst.populate(scanner);
        bst.display();
        bst.preOrder();
        System.out.println(bst.balance()); 


    }
}
