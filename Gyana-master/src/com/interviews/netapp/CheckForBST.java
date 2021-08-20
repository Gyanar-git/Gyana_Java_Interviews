package com.interviews.netapp;

public class CheckForBST {
    static class Node{
        int data;
        Node leftChild,rightChild;

        Node(int val){
            data = val;
            leftChild = rightChild = null;
        }

    }

    static class BTree{
        Node root;

        boolean checkIfBST(){
            boolean isTrue = isBSTORNot(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
            return isTrue;
        }

        boolean isBSTORNot(Node node , int min , int max){
            if(node == null){
                return true;
            }
            if(node.data < min || node.data > max){
                return false;
            }

            return (isBSTORNot(node.leftChild,min,node.data -1) &&
                    isBSTORNot(node.rightChild , node.data + 1 , max));

        }
    }

    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(5);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(7);

        tree.root.leftChild.leftChild = new Node(10);
        tree.root.leftChild.rightChild = new Node(3);

        if(tree.checkIfBST()){
            System.out.println("Given Binnary tree is a BST");
        }else{
            System.out.println("GIven ree not a BST");
        }


    }

}
