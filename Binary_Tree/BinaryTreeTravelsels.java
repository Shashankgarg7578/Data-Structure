package Binary_Tree;

class Node
{
	int data;
	Node left;
	Node right;
	
}

class TreeTraversal
{
	public Node createNodes(int k) 
	{
	Node  n = new Node();
	n.data = k;
	n.left = null;
	n.right = null;
	return n;

	}
}

class traversal
{
	public void preorder(Node node)
	{
		if(node == null)
		{
			return ;
		}
		else
		{
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void inorder(Node node)
	{
		if(node == null)
		{
			return ;
		}
		else
		{
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	
	public void postorder(Node node)
	{
		if(node == null)
		{
			return ;
		}
		else
		{
			postorder(node.left);
			postorder(node.right);
            System.out.print(node.data+" ");
		}
	}
}

public class BinaryTreeTravelsels 
{
 public static void main(String[] args) 
 {
	 TreeTraversal tt = new TreeTraversal();
	
	 Node root = tt.createNodes(2);
     root.left = tt.createNodes(7);
     root.right = tt.createNodes(5);
     root.left.left = tt.createNodes(2);
     root.left.right = tt.createNodes(6);
     root.left.right.left = tt.createNodes(5);
     root.left.right.right = tt.createNodes(11);
     
     root.right.right = tt.createNodes(9);
     root.right.right.left = tt.createNodes(4);
     
     System.out.println("preorder:");
     traversal t = new traversal();
     t.preorder(root);
     System.out.println();
     System.out.println();
     System.out.println("Inorder:");
     t.inorder(root);
     System.out.println();
     System.out.println();
     System.out.println("postorder:");
     t.postorder(root);
     
     
     
     

 }
}
