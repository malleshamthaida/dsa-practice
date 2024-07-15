package com.mst.linkedlist;

import java.util.Stack;

public class ReverseLinkedListByStack {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(list, 1);
        list.insert(list, 4);
        list.insert(list, 9);
        list.print(list);
        reverLinkedList(list);
        list.print(list);

    }
    public static void reverLinkedList(LinkedList list){
        LinkedList.Node temp=list.head;
        Stack<LinkedList.Node> stack=new Stack<>();
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;

        }
       list.head=temp;

        while (temp!=null){
            temp.next=stack.peek();

        }


    }
}
