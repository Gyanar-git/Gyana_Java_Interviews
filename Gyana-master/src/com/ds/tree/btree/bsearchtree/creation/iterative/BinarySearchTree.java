package com.ds.tree.btree.bsearchtree.creation.iterative;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean add(int value){
        if(isEmpty()){
            root = new Node(value);
            return true;
        }

        Node currentNode = root;
        while (currentNode != null){
            Node leftChild = currentNode.getLeftChild();
            Node rightChild = currentNode.getRightChild();

            //If the value to insert is less than root value then move to left subtree
            //else move to right subtree of root
            //and before moving check if the subtree is null, if it's then insert the value.
            if (currentNode.getData() > value) {
                if (leftChild == null) {
                    leftChild = new Node(value);
                    currentNode.setLeftChild(leftChild);
                    return true;
                }
                currentNode = leftChild;
            } else {
                if (rightChild == null) {
                    rightChild = new Node(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }
                currentNode = rightChild;
            } //end of else

        }

        return false;
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

    //Searches value in BST
    //Either returns the Node with that value or return null
    public Node search(int value) {

        if (isEmpty()) return null; // if tree is empty simply return null

        Node currentNode = this.root;

        while (currentNode != null) {

            if (currentNode.getData() == value) return currentNode; // compare data from current node

            if (currentNode.getData() > value) //if data from current node is greater than value
                currentNode = currentNode.getLeftChild(); // then move towards left subtree
            else
                currentNode = currentNode.getRightChild(); //else move towards right subtree
        }

        System.out.println(value + " Not found in the Tree!");
        return null;
    }
}
