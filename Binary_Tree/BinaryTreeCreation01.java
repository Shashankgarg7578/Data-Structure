package Binary_Tree;

class Noode
{
int data;
Noode left;
Noode right;
}

class  BinaryTree
{
	public Noode createNoode(int k)
	{
		Noode a = new Noode();
		a.data = k;
		a.left = null;
		a.right = null;
		System.out.println("Nodes are :"+a.data);
		return a;
		
	}	
	
	
	public int SumOfAllNodes(Noode node)
	{
		if(node==null)
		{
			return 0;
		}
		
			return  node.data+ SumOfAllNodes(node.left) + SumOfAllNodes(node.right);
	}
	
	
	public Noode DeleteAllNodes(Noode ro)
	{
		if(ro == null)
		{
			return null;
		}
		
	    ro.left = DeleteAllNodes(ro.left);
	    ro.right = DeleteAllNodes(ro.right);
	    
	    System.out.println("Deleting node "+ro.data);
		ro = null;
		return ro;
	}
}


public  class BinaryTreeCreation01 
{
  public static void main(String[] args) 
  {
	  BinaryTree a = new BinaryTree();	
      Noode root = a.createNoode(2);
      root.left = a.createNoode(7);
      root.right = a.createNoode(5);
      root.left.left = a.createNoode(2);
      root.left.right = a.createNoode(6);
      root.left.right.left = a.createNoode(5);
      root.left.right.right = a.createNoode(11);   
      root.right.right = a.createNoode(9);
      root.right.right.left = a.createNoode(4);
      
      System.out.println("--------------------------");
      System.out.println();
      System.out.println("Sum of All Nodes :"+a.SumOfAllNodes(root));
      System.out.println();
      System.out.println("--------------------------");
      System.out.println();
      System.out.println("Delete nodes are :"+a.DeleteAllNodes(root));
     
 } 
}
