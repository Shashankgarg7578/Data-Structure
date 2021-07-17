package Binary_Search_Tree;

class Node
{
  int data;
  Node left , right;
}

class BST
{
	public Node createNewNode(int k)
	{
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
	public  Node insert(Node node,int val)
	{
		if(node==null)
		{
			return createNewNode(val);
		}
		
		if(val<node.data)
		{
			 node.left = insert(node.left,val);
		}
		else if(val>node.data)
		{
			node.right = insert(node.right,val);
		}
		return node;
	}
	
	public boolean FindElement(Node node , int data)
	{
		if(node==null)
		{
			System.out.println("false");
		 return false;
		}
		if(data>node.data)
		{
			System.out.println("Right side data");
			return FindElement(node.right, data);
		}
		else if(data<node.data)
		{
			System.out.println("left side data");
			return FindElement(node.left, data);
		}
		else
		{
			System.out.println("true");
			return true;
		}
	}

	
	 
}
public class BST_Insertion 
{
  public static void main(String[] args) 
  {
     BST a = new BST();
     Node root = null;

     root =  a.insert(root, 8);
     root =  a.insert(root, 3);
     root =  a.insert(root, 6);
     root =  a.insert(root, 4);
     root =  a.insert(root, 7);
     root =  a.insert(root, 1);
     root =  a.insert(root, 10);
     root =  a.insert(root, 14);
      root = a.insert(root, 13);
      
     a.FindElement(root, 13);
   
  }
}

