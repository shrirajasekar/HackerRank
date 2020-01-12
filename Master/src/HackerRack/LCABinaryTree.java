package HackerRack;

import java.util.Scanner;

/**
 * LCABinaryTree
 */
public class LCABinaryTree {

    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] vals = scan.nextLine().split(" ");
        BTree T = new BTree();
        for (int i = 0; i < vals.length; i++) {
            T.add(Integer.parseInt(vals[i]));
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        Node lca = lca(T,v1,v2);
        System.out.println(lca.data);
    }

    private static Node lca(BTree t, int v1, int v2) {
        Node curr = t.root;
        while(curr.data!=null){
            if(curr.data<v1 && curr.data<v2){
                curr = curr.right;
            }else if(curr.data>v1 && curr.data>v2){
                curr = curr.left;
            }
            else{
                return curr;
            }
        }
        return curr;
    }

    
}

class Node {
    Integer data =null;
    Node left = null;
    Node right = null;
}

class BTree{
    Node root = new Node();

    public void add(int nodeVal) {
        Node curr = new Node();
        if (this.root.data == null) {
            this.root.data = nodeVal;
            this.root.left = new Node();
            this.root.right = new Node();
        }else{
        curr = this.root;
        while (curr.data != null) {
            if (nodeVal <= curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        curr.data = nodeVal;
        curr.left = new Node();
        curr.right = new Node();
        }
        
    }
}
