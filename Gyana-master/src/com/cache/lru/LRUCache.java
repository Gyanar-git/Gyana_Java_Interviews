package com.cache.lru;

import java.util.HashMap;

public class LRUCache {
    private HashMap<Integer,Node> map;
    private int capacity,count;
    private Node head,tail;

    public LRUCache(int capacity)
    {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;
    }
}
