package com.mst.linkedlist;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(list, 1);
        list.insert(list, 4);
        list.insert(list, 1);
        list.insert(list, 9);
        list.print(list);

    }
}
