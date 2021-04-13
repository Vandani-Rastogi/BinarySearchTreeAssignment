package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<Integer>();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        boolean result = tree.search(30);
        System.out.println("Element is present: "+result);
        //create binary search tree
        // and perform insert, search, traversal, delete
    }
}
