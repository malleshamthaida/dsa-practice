package com.mst.linkedlist;

public class ReverseLinkedListByIterative {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(list, 1);
        list.insert(list, 4);
        list.insert(list, 9);
        list.print(list);
        reverLinkedList(list);
        list.print(list);

    }

    public static void reverLinkedList(LinkedList list) {

        LinkedList.Node prev = null, curr = list.head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }
        list.head = prev;

    }
}
