package com.interviews.rakuten;

public class BSTTree {
	Node root;
	BSTTree(){
		root = null;
	}

	void insertElementToBST(int key){
		root = recurseAddElement(root,key);
	}

	private Node recurseAddElement(Node root, int key) {
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key < root.key){
			root.leftcChild = recurseAddElement(root.leftcChild , key);
		}else{
			root.rightChild = recurseAddElement(root.rightChild , key);
		}
		return root;
	}

	public static void main(String[] args) {
		BSTTree bstTree = new BSTTree();
		bstTree.insertElementToBST(40);
		bstTree.insertElementToBST(20);
		bstTree.insertElementToBST(10);
		bstTree.insertElementToBST(5);
		bstTree.insertElementToBST(60);


	}
}
