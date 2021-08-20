//package com.interviews.oracle.linkedlist;
//
//public class LinkedList {
//
//    static class Node{
//        int data;
//        Node next;
//        int flag;
//    }
//
//    static Node push(Node ref, int data){
//
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.flag = 0;
//        newNode.next = ref;
//
//        ref = newNode;
//        return ref;
//    }
//
//    static Boolean detectNodeIsHavingLoop(Node n) {
//        while (n != null) {
//            if (n.flag == 1) {
//                return true;
//            } else {
//                n.flag = 1;
//                n = n.next;
//            }
//        }
//        return false;
//    }
//
//        public static void main(String args[]){
//            Node head = null;
//            head = push(head, 12);
//            head = push(head, 13);
//            head = push(head, 14);
//            head = push(head, 15);
//
//            head.next.next.next = head;
//            if (detectNodeIsHavingLoop(head)) {
//                System.out.println("Loop found in the data structure maintained");
//            } else {
//                System.out.println("There is no loop found in th DS");
//            }
//        }
//
//        detetctAndRemove(Node n){
//        Node slow = n,fast = n;
//        while(slow != null && fast != null &&
//        fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//
//            if(slow == fast){
//                removeLoop(slow,n);
//                return 1;
//
//            }
//
//
//        }
//
//        }
//}
