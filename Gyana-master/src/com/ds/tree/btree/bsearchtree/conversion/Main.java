package com.ds.tree.btree.bsearchtree.conversion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(5);
        root.left.left = new Node(10);
        root.left.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(6);

        // traverse the binary tree and store its keys in a set
        Set<Integer> mySet = new TreeSet<>();
        extractKeys(root, mySet);

        // put back keys present in the set to their correct order in the BST
        Iterator<Integer> it = mySet.iterator();
        convertToBST(root,it);

        // print the BST
        inorder(root);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    /// Function to put keys back into a set in their correct order in the BST
    //  by doing inorder traversal
    private static void convertToBST(Node root, Iterator<Integer> it) {
        if (root == null) {
            return;
        }
        convertToBST(root.left, it);
        root.data = it.next();
        convertToBST(root.right, it);
    }

    // Function to traverse the binary tree and store its keys in a set
    private static void extractKeys(Node root, Set<Integer> mySet) {
        if(root == null){
            return;
        }else{
            extractKeys(root.left,mySet);
            mySet.add(root.data);
            extractKeys(root.right,mySet);
        }
    }
}
