package AVL_Tree;

public class AVL_Tree
{
  	private class Node
  	{
  		int data;
  		Node left;
  		Node right;
  		int height;
  		
  		Node (int data)
  		{
  			this.data = data;
  			this.height = 1;
  		}
  	}
  	
  	private Node root;
  	
  	public void insert(int item)
  	{
  		this.root = insert(this.root , item);
  	}
  	
  	private Node insert(Node node , int item)
  	{
  		if(node == null)
  		{
  			Node nn = new Node(item);
  			return nn;
  		}
  		
  		if(item > node.data)
  		{
  			node.right = insert(node.right,item);
  		}
  		else if(item < node.data)
  		{
  			node.left = insert(node.left,item);
  		}
  		
  		node.height = Math.max(height(node.left) , height(node.right)) +1;
  		
  		int bf = bf(node);
  		
  		//LL case
  		if(bf>1 && item < node.left.data)
  		{
  			return rightRotation(node);
  		}
  		
  		//RR case
  		if(bf < -1 && item > node.right.data)
  		{
  			return leftRotation(node);
  		}
  		
  		//LR case
  		if(bf > 1 && item > node.left.data)
  		{
  			node.left  = leftRotation(node.left);
  			return rightRotation(node);
  		}
  		
  	    //RL case
  		if(bf < -1 && item < node.right.data)
  		{
  			node.right= rightRotation(node.right);
  			return leftRotation(node);
  		}
  		return node;
  	}
  	
 public void display()
 {
	 display(this.root);
 }
  	
 private void display(Node node)
 {
	 if(node == null)
	 {
		 return;
	 }
	 String str = "";
	 if(node.left == null)
	 {
		 str += ".";
	 }
	 else 
	 {
		str += node.left.data; 
	 }
	 
	 str += " => " + node.data + " <= ";
	 
	 if(node.right == null)
	 {
		 str += ".";
	 }
	 else 
	 {
		str += node.right.data; 
	 }
	 
	 System.out.println(str);
	 display(node.left);
	 display(node.right);
 }
 
 private int height(Node node)
 {
	 if(node==null)
	 {
		 return 0;
	 }
	 return node.height;
 }
 
 private Node rightRotation(Node c)
 {
	 Node b = c.left;
	 Node T3 = b.right;
	 
	 // Rotate
	 b.right = c ;
	 c.left = T3;
	 
	 //height update
	 c.height = Math.max(height(c.left) , height(c.right)) + 1;
	 b.height = Math.max(height(b.left) , height(b.right)) + 1;
	 
	 return b;
 }
 
 private Node leftRotation(Node c)
 {
	 Node b = c.right;
	 Node T2 = b.left;
	 
	 // Rotate
	 b.left = c ;
	 c.right  = T2;
	 
	 //height update
	 c.height = Math.max(height(c.left) , height(c.right)) + 1;
	 b.height = Math.max(height(b.left) , height(b.right)) + 1;
	 
	 return b;
 }
 
 //Calculate Balance factor 
 private int bf(Node node)
 {
	 if(node == null)
	 {
		 return 0; 
	 }
	 
	 return height(node.left) - height(node.right);
 }
}  
















