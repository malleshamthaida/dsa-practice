package com.mst.tree.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void preOrder(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            System.out.println(node.data);
            if (node.left != null)
                preOrder(node.left);
            if (node.right != null)
                preOrder(node.right);
        }

    }

    public void postOrder(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {

            if (node.left != null)
                preOrder(node.left);
            if (node.right != null)
                preOrder(node.right);
            System.out.println(node.data);
        }

    }




    public void levelOrder(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                System.out.println(currentNode.data);
                if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null)
                    queue.add(currentNode.right);
            }
        }
    }

    public int findHeight(Node node){
        if (node == null)
            return 0;
        else {
            int leftLevel = findHeight(node.left);
            int rightLevel = findHeight(node.right);
            if (leftLevel > rightLevel)
                return leftLevel + 1;
            else return rightLevel + 1;
        }

    }

    public void inserData(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (true) {
                Node node = queue.remove();
                if (node.left != null && node.right != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                } else {
                    if (node.left == null) {
                        node.left = newNode;
                    } else {
                        node.right = newNode;

                    }
                    break;
                }

            }
        }

    }
}
