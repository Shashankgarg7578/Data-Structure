package Binary_Search_Tree;

class Noode
{
  int data;
  Noode left;
Noode right;
}

class BinaryST
{
	public Noode createNode(int val)
	{
		Noode n = new Noode();
		n.data = val;
		n.left = null;
		n.right = null;
		return n;
	}
	
	public Noode insertt(Noode node,int val)
	{
		if(node==null)
		{
			return createNode(val);
		} 
		if(val<node.data)
		{
			node.left = insertt(node.left,val);
		}else if(val>node.data)
		{
			node.right = insertt(node.right,val);
		}
		return node;	
	}	
	
	public Noode Delete(Noode node , int val)
	{
		if(node==null)
		{
			return null;
		}
		
		if(val<node.data)
		{
			node.left = Delete(node.left, val);	
		}
		else if(val>node.data) 
		{
			node.right = Delete(node.right, val);
		}
		else
		{
		   if(node.left!=null && node.right !=null)
		   {
			int leftmax = max(node.left);
			node.data = leftmax;
			node.left = Delete(node.left , leftmax);
			System.out.println(node.data);
			return node;
		   }
		   else if(node.left!=null)
		   {
			 return node.left;
		   }
		   else if(node.right!=null)
		   {
			   return node.right;
		   }
		   else 
		   {
			   return null;
		   }
		}
		
		return node;
	}
	
	public int max(Noode node)
	{
		if(node.right!=null)
		{
			return max(node.right);
		}
		else
		{
			return node.data;
		}
		
	}
}


public class BST_Deletion 
{
	public static void main(String[] args) {
		
		BinaryST B = new BinaryST();
		Noode root = null;
		
		root =  B.insertt(root, 50);
	     root =  B.insertt(root, 25);
	     root =  B.insertt(root, 75);
	     root =  B.insertt(root, 12);
	     root =  B.insertt(root, 10);
	     root =  B.insertt(root, 20);
	     root =  B.insertt(root, 37);
	     root =  B.insertt(root, 30);
	     root =  B.insertt(root, 40);
	     root =  B.insertt(root, 60);
	     root =  B.insertt(root, 87);
	     
	     B.Delete(root, 25);
	     
	}
}
