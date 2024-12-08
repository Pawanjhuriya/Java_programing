import org.w3c.dom.Node;

public class Xl_Binarytree {
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

    // public static int height(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     return Math.max(lh, rh)+1;
    // }

    // public static int diameter(Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int leftdia = diameter(root.left);
    //     int lefthl = height(root.left);
    //     int rightdia = diameter(root.right);
    //     int rightrh = height(root.right);
        

    //     int selfdia = lefthl + rightrh + 1;
    //     return Math.max(selfdia , Math.max(leftdia, rightdia));
    // }

    public static void Klevel(Node root, int level, int k){
        if (root == null) {
            return ;
            
        }

        if (level == k) {
            System.out.print(root.data+" ");
            
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        int k = 3;
        Klevel(root, 1, k);
    }
}
