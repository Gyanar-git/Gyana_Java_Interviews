package com.ds.tree.btree.bsearchtree.creation.recursive;

import com.ds.tree.btree.bsearchtree.creation.iterative.Node;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //Recursive function to insert a value in BST
    public Node recursive_insert(Node currentNode, int value) {

        //Base Case
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.getData()) {
            //Iterate left sub-tree
            currentNode.setLeftChild(recursive_insert(currentNode.getLeftChild(), value));
        } else if (value > currentNode.getData()) {
            //Iterate right sub-tree
            currentNode.setRightChild(recursive_insert(currentNode.getRightChild(), value));
        } else {
            // value already exists
            return currentNode;
        }

        return currentNode;

    }

    //Function to call recursive insert
    public boolean add(int value) {

        root = recursive_insert(this.root, value);
        return true;
    }

    //Function to check if Tree is empty or not
    public boolean isEmpty(){
        return root == null; //if root is null then it means Tree is empty
    }

    //Just for Testing purpose
    public void printTree(Node current)
    {
        if (current == null) return;

        System.out.print(current.getData() + ",");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());

    }

    /*
    Root-L-R
     */
    public void preTraverse(Node root) {

        if (root == null) return;

        System.out.print(root.getData() + ",");
        preTraverse(root.getLeftChild());
        preTraverse(root.getRightChild());
    }

    /*
    L-Root-R
     */
    public static void inTraverse(Node root) {

        if (root == null) return;

        inTraverse(root.getLeftChild());
        System.out.print(root.getData() + ",");
        inTraverse(root.getRightChild());

    }

    /*
    L-R-Root
     */
    public static void postTraverse(Node root) {

        if (root == null) return;

        postTraverse(root.getLeftChild());
        postTraverse(root.getRightChild());
        System.out.print(root.getData() + ",");


    }
}
