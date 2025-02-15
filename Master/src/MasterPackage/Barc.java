package MasterPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Barc {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    String[] nodes = null;
    int n1, n2;
    while ((line = in.readLine()) != null) {
    	nodes = line.split(" ");
    	n1 = Integer.parseInt(nodes[0]);
        n2 = Integer.parseInt(nodes[1]);
      //Hard coding the Binary Search Tree
    	BTree T = new BTree(); 
    	T.root = new Node(30); 
    	T.root.left = new Node(8); 
    	T.root.right = new Node(52); 
    	T.root.left.left = new Node(3); 
    	T.root.left.right = new Node(20); 
    	T.root.left.right.left = new Node(10); 
    	T.root.left.right.right = new Node(29); 

    	 
    	Node rootNode = T.lca(T.root, n1, n2); 
    	System.out.println(rootNode.elemValue);   
    }
              
  }
}

class Node 
{ 
	int elemValue; 
	Node left, right; 

	Node(int x) 
	{ 
		elemValue = x; 
		left = right = null; 
	} 
} 

class BTree 
{ 
	Node root;
	Node lca(Node node, int n1, int n2) 
	{ 
		if (node == null) 
			return null; 
 
		if (node.elemValue > n1 && node.elemValue > n2) 
			return lca(node.left, n1, n2); 
		
		if (node.elemValue < n1 && node.elemValue < n2) 
			return lca(node.right, n1, n2); 

		return node; 
	}
}

