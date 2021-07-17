package DoubleLinkedList;
import java.util.Scanner;

class Node
{
  private int data;
  private Node left,right;
  public void node(int d,Node l,Node r)
  {
		data=d;
		left=l;
		right=r;
  }
  public void setdata(int value) 
  {
     data = value;	
  }
  public void setleft(Node n) 
  {
	left = n;
  }
  public void setright(Node n)
  {
	right  = n;
   }
  public Node getleft()
  {
	return left;
  }
  public Node getright()
  {
	return right;
  }
  public int getdata() 
  {
	return data;
   }
}

class DLinkedList
{
  private int size;
  private Node root;
   DLinkedList()
  {
	  size = 0;
	  root = null;	  
  }
   
  public void  InsertAtFirst(int value)
  {
	  Node n;
	  n = new Node();
	  n.setdata(value);
	  n.setleft(null);
	  n.setright(root);  
	  if(root!=null)
	  {
		  root.setleft(n);
	  }
	  root = n;
  }
  
  public int length()
  {
  	int count=0;
  	Node p;
  	p=root;
  	while(p!=null)
  	{
  		
  		p = p.getright();
  		count++;
  	}
  	return count;
  }
  
 public void  InsertAtspecified(int value,int pos)
 {   int i=1;
	 Node p,q,n;
	 n=new Node();
	 n.setdata(value);
	 p=root;
	 
	 if(root==null)
	 {
		 System.out.println("There is No Element in Doubly Linked List");
	 }
	 else if(pos==length())
		{
			while(i<pos)
			{
				p=p.getright();
				i++;
			}
			p.setright(n);
			n.setleft(p);
			n.setright(null);
		}
	 else
	 {
		 if(pos<length())
		 {
			 System.out.println("Invalid length");
		 }
		 else
		 {
			 
			 while(i<pos)
			 {
				 p=p.getright();
				 i++;
			 }
			 q = p.getright();
			 n.setright(q);
			 q.setleft(n);
			 n.setleft(p);
			 p.setright(n);		  	 
		 }
	 }
 }
 
 public void display()
 {
   Node p ;
   p = root;
   if(root==null)
   {
	   System.out.println("there are no element in DLinked List");
   }
   else
   {
	   while(p!=null)
	   {
		   System.out.println("Elements are ="+p.getdata());
		   p=p.getright();
	   }
   }
 }
 
 public void delete(int pos)
	{
		Node p,n,temp;
		p=root;
		if(p==null)
		{
			System.out.println("the list is empty...");
		}
		else
		{
			if(pos>length())
			{
			System.out.println("invalid position...");
			}
			else if(pos==1)
			{
			 root=p.getright();
			 p.getright().setleft(null);
			 p.setright(null);
			}
			else
			{
				int i=1;
				while(i<pos-1)
				{
					p=p.getright();
					i++;
				}
				temp=p.getright();
				p.setright(temp.getright());
				temp.getright().setleft(p);
				temp.setright(null);
				temp.setleft(null);			
			}	
		}
	}
 }

public class DoublyLinked_List
{
	static Scanner sc = new Scanner(System.in);
	static DLinkedList dll = new DLinkedList();
	static int value,pos;
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("1.Insert an Element at first");
	        System.out.println("2.insert element at specified position");
	        System.out.println("3.delete element from position");
	        System.out.println("4.display");
	//      System.out.println("5.reverse the list");
   //       System.out.println("6.swap the nodes from position");
	        System.out.println("7.length of list");
	        System.out.println("8.Exit");
	        
	        System.out.print("Enter you choice :-");
	        int choice = sc.nextInt();		
	        
	        switch(choice)
	        {
	        case 1:
	        	System.out.print("Enter a element :-");
	               value = sc.nextInt();
	               dll.InsertAtFirst(value);
	               break;
	        case 2:System.out.print("Enter a element :-");
                  value = sc.nextInt();
	              System.out.println("Enter a position :-");
                  pos = sc.nextInt();
                 dll.InsertAtspecified(value,pos);
	              break;
	        case 3:System.out.print("enter the position"); 
     	           pos = sc.nextInt();
                  dll.delete(pos);
                   break;
	        case 4: dll.display();
	                break;
	        case 7:int len = dll.length();
	               System.out.println("Length is :-"+len);
	               break;
	                
	        
	        case 8:System.exit(1);
	        
	        default:System.out.println("invalid choice");
	        }
	        
		}
			
	}
	
}