//package com.interviews.oci;
//
//public class Solution {
//    Node head;
//
//    static class Node{
//        String data;
//        Node prev;
//        Node next,child;
//
//        public Node(String data, Node prev, Node next, Node child) {
//            this.data = data;
//            this.prev = prev;
//            this.next = next;
//            this.child = child;
//        }
//    }
//    public static Node flatternDoubliLinkexList(Node node) {
//        if(node == null){
//            return null;
//        }
//        Node current = node;
//
//        while(current != null){
//            if(current.child != null){
//                Node nextNode = current.next;
//                Node childNode = flatternDoubliLinkexList(current.child);
//                current.child = null;
//                current.next = childNode;
//                current.prev = current;
//
//                while(current.next != null){
//                    current = current.next;
//                    current.next = nextNode;
//                }
//                if(nextNode != null){
//                    nextNode.prev = current;
//                }
//            }
//            flatternDoubliLinkexList(current.next);
//            return node;
//
//        }
//
//
//
//
//}
//
//
