package com.interviews.netapp;

public class ReverseLinkedList {
    Node head;

    Node reverseLinkedList (Node head,int j){
        if(head == null){
            return null ;
        }
        Node cur = head;
        Node next = null;
        Node prev = null;
        int c = 0;
        while(c < j &&  cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            c++;
        }
        if(next != null){
            head.next = reverseLinkedList(next,j);
        }
        return prev;

    }

    void printFInalLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }

    void push(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public static void main(String[] args) {
        ReverseLinkedList myList = new ReverseLinkedList();
//        1 2 3 4 5 6 7 8 9
//        4 3 2 1 9 8 7 6 -> null
//        step 4
        int k = 4;

        myList.push(1);
        myList.push(2);
        myList.push(3);
        myList.push(4);
        myList.push(5);
        myList.push(6);
        myList.push(7);
        myList.push(8);
        myList.push(9);

        System.out.println("Before reversal of the list");
        myList.printFInalLinkedList();

        myList.head = myList.reverseLinkedList(myList.head ,k );
        System.out.println("AFter the reversal of the list");
        myList.printFInalLinkedList();


    }


}


