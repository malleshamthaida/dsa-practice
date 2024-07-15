package com.mst.tree.array;

public class BinaryTreeImpl {

    public static void main(String[] args) {
       BinaryTree tree=new BinaryTree();
       tree.root("A");
       tree.setLeftChild("B",1);
       tree.setRightchild("C",1);
        tree.setLeftChild("D",2);
        tree.setRightchild("E",3);
       tree.printBinaryTree();
    }



}

class BinaryTree{
    String arr[]=new String[10];

    void root(String s){
       arr[1]= s;
    }

    public void setLeftChild(String s,int root){
      int index=(2*root);

      if(arr[root]!=null){
          arr[index]=s;
      }else{
          System.out.println("Cannot add left child as root not exist");
      }


    }

    public void setRightchild(String s,int root){
        int index=(2*root)+1;
        if(arr[root]!=null){
            arr[index]=s;
        }else{
            System.out.println("Cannot add Right child as root doesnt exist");
        }

    }

    public void printBinaryTree(){

        for(int i=1;i< arr.length;i++){

            if(arr[i]!=null){
                System.out.print(arr[i]);
            }else{
                System.out.print("-");
            }
        }

    }

}
