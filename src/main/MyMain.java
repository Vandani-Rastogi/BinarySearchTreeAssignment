package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<Integer>();
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        boolean result = tree.search(30);
        System.out.println("Element is present: "+result);
        System.out.println("Inorder traversal of binary search tree is-");
        tree.inOrder(tree.getRoot());
        System.out.println();
        System.out.println("Preorder traversal of binary search tree is-");
        tree.preOrder(tree.getRoot());
        System.out.println();
        System.out.println("Postorder traversal of binary search tree is-");
        tree.postOrder(tree.getRoot());
        System.out.println();
        System.out.println("Reversal Inorder traversal of binary search tree is-");
        tree.reverseInOrder(tree.getRoot());
        //create binary search tree
        // and perform insert, search, traversal, delete
    }
}
