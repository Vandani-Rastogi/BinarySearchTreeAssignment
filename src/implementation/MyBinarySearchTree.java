package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private implementation.Node<E> root;//head

    public implementation.Node<E> getRoot() {
        return root;
    }
    @Override
    public void insert(E data) {
    implementation.Node<E> node = new implementation.Node<>(data);
        if (isEmpty()) {
            root = node;
        } else {
            implementation.Node<E> temp = root;
            implementation.Node<E> parent = null;
            while (temp != null) {
                parent = temp;
                if (data.compareTo(temp.getData()) <= 0) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            //identifying the position left or right
            //to insert new node
            if (data.compareTo(parent.getData()) <= 0) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    private boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean search(E searchElement) {
        boolean response = false;
        implementation.Node<E> temp = root;
        while (temp != null) {
            //comparing with root
            if (searchElement.compareTo(temp.getData()) == 0) {
                response = true;
                break;
            } else if (searchElement.compareTo(temp.getData()) < 0) {
                temp = temp.getLeft();
            } else
                temp = temp.getRight();
        }
        return response;
    }

    @Override
    public void inOrder(implementation.Node<E> node) {
        if (node != null) {
            //step1--> process left subtree
            //recursive call
            inOrder(node.getLeft());
            //step2
            System.out.print(node.getData() + ",");
            //step3
            inOrder(node.getRight());
        }
    }

    @Override
    public void preOrder(implementation.Node<E> node) {
        if (node != null) {
            //step 1
            System.out.print(node.getData() + ", ");
            //step 2
            //recursive call
            preOrder(node.getLeft());
            //step 3
            preOrder(node.getRight());
        }
    }

    @Override
    public void postOrder(implementation.Node<E> node) {
        if(node!=null)
        {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData() + ",");
        }
    }

    @Override
    public void reverseInOrder(implementation.Node<E> node) {
        if (node != null) {
        //step1--> process right subtree
        //recursive call
        reverseInOrder(node.getRight());
        //step2
            System.out.print(node.getData() + ",");
            //step3
        reverseInOrder(node.getLeft());
        }
    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
