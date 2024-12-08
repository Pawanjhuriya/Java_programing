import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class Xk_Treebasic {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class  Binarytree {
    static int idx = -1;
    public static Node buildtree(int nodes[]){
        idx++;
        if (nodes[idx] == -1) {
            return null;
            
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildtree(nodes);
        newNode.right = buildtree(nodes);


        return newNode;
    }
        
    

        public static void preorder(Node root){
             if (root == null) {
                return; 
            }
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);   
        }
    
        public static void inorder(Node root){
           
            if (root == null) {
               return;
           }
           inorder(root.left);
           System.out.print(root.data+ " ");
           inorder(root.right);
       }
       public static void postorder(Node root){
           
        if (root == null) {
           return;
       }
       postorder(root.left);
       postorder(root.right);
       System.out.print(root.data+ " ");
       
       }



       //level order traveesal
       public static void levelorder(Node root){
        if (root == null) {
            return;
            
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node cuurNode = q.remove();
            if (cuurNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                    
                }else{
                    q.add(null);
                }
                
            }else{
                System.out.print(cuurNode.data+ " ");
                if (cuurNode.left != null) {
                    q.add(cuurNode.left);

                    
                }
                if (cuurNode.right != null) {
                    q.add(cuurNode.right);
                    
                }
            }
            
        }
       }



    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);

        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelorder(root);
    }
}
