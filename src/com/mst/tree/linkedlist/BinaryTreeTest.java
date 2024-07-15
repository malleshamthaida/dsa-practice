package com.mst.tree.linkedlist;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.inserData(1);
        bt.inserData(2);
        bt.inserData(3);
        bt.inserData(4);
        bt.inserData(5);
        bt.inserData(6);
        bt.inserData(7);  bt.inserData(8);

       // bt.levelOrder(bt.root);
        System.out.println("Height of the tree =="+bt.findHeight(bt.root));
    }

}
