public class TestApp {



    public static void main(String[] args) {
      Node node=new Node(1);
      node.left=new Node(2);
      node.right=new Node(3);
      node.right.left=new Node(4);
      node.right.left.right=new Node(5);
     System.out.println( maxDepth(node));

    }

    public static  int maxDepth(Node node) {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }

    }


}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data=data;
      this.left=null;
      this.right=null;
    }

}
