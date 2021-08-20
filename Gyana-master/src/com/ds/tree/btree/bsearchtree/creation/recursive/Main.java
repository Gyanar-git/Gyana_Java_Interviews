package com.ds.tree.btree.bsearchtree.creation.recursive;

public class Main {

    public static void main(String args[])
    {
        BinarySearchTree bsT = new BinarySearchTree();

        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);
        bsT.add(10);
        bsT.add(14);

        bsT.printTree(bsT.getRoot());

        System.out.println("\n");

        bsT.preTraverse(bsT.getRoot());

        System.out.println("\n");

        bsT.inTraverse(bsT.getRoot());


        System.out.println("\n");

        bsT.postTraverse(bsT.getRoot());
    }


}
