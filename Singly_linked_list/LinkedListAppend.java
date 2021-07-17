 package Singly_linked_list;

import java.util.Scanner;

class node
{
	private int data;
	private node next;
	public void setdata(int value)
	{
		data = value;
	}
	
	public void setnext(node n)
	{
		next=n;
	}
	public node getnext() {
		
		return next;
	}
	public int getdata() {
		// TODO Auto-generated method stub
		return data;
	}
	
	public void node(int d,node n)
	{
		data=d;
		next=n;
	}
}

 class linkedlist
{
 private int size;
 private node root;
    linkedlist()
    {
    	size = 0;
    	root = null;
    }
    
    public void insertatfirst(int value)
    {
        node n;
        n = new node();
        n.setdata(value);
        n.setnext(root);
        root = n;
    }
    
    
    public void insertAtSpecified(int value , int pos)
    {
    	node  n,p,q;
    	n = new node();
    	n.setdata(value);
    	n.setnext(null);
    	p=root;
    	int i = 1;
    	if(root==null)
    	{
    		System.out.println("There is no element in the linked list");
    	}
    	else
    	{
    		if(pos>length())
    		{
    			System.out.println("invalid Position");
    		}
    		else
    		{
    			while(i<pos)
    			{
    				p=p.getnext();
    				i++;
    			}
    		}
    	}
    	q = p.getnext();
    	p.setnext(n);
    	n.setnext(q);
    }
    
    public int length()
    {
    	int count=0;
    	node p;
    	p=root;
    	while(p!=null)
    	{
    		p = p.getnext();
    		count++;
    	}
    	return count;
    }
    
    public void deleteElement(int pos)
    {
    	node p,q;
    	p=root;
    	int i =1;
    	if(pos==1)
    	{
    		root= p.getnext();
    		p.setnext(null);
    	}
    	else if(pos>length())
    	{
    		System.out.println("invalid position");
       	}
    	else
    	{
    	  if(root==null)
    	  {
    		  System.out.println("the linked list is empty");
    	  }
    	   else
    	   {
    		while(i<pos-1)
    		{
    			p=p.getnext();
    			i++;
    		}
    		q=p.getnext();
    		p.setnext(q.getnext());
    		q.setnext(null);
    	   }
    	}
    }
    
    public void display()
    {
    	node p;
    	p=root;
    	if(root==null)
    	{
    		System.out.println("The linked list is empty");
    	}
    	else
    	{
    		while(p!=null)
    		{
    			System.out.println(""+p.getdata());
    			 p= p.getnext();	 
    		}
    	}
    }
    
    public void swap(int pos)
    {
    	node p,q,r;
    	int i = 1;
    	p=root;
    	while(i<pos-1)
    	{
    		p=p.getnext();
    		i++;
    	}
    	q=p.getnext();
    	r=q.getnext();
    	q.setnext(r.getnext());
    	r.setnext(q);
    	p.setnext(r);
    	
    }
}
 
 
public class LinkedListAppend
{
	static Scanner sc = new Scanner(System.in);
	static linkedlist ll = new linkedlist();
	static int value,pos;
   public static void main(String[] args)
   {
      while(true)
      {
    	System.out.println("1.Insert an Element at first");
        System.out.println("2.insert element at specified position");
        System.out.println("3.delete element from position");
        System.out.println("4.display");
        System.out.println("5.reverse the list");
        System.out.println("6.swap the nodes from position");
        System.out.println("7.length of list");
        System.out.println("8.Exit");
        
        System.out.print("Enter you choice :-");
        int choice = sc.nextInt();
        
        switch(choice)
        {
        case 1: System.out.print("enter a value:-");
                value = sc.nextInt();
                ll.insertatfirst(value);
                break;
                
                //In Linked List also the index start with 0.
        case 2: System.out.print("enter a value:-");
                value = sc.nextInt();
                System.out.print("Enter the Position");
                pos = sc.nextInt();
                ll.insertAtSpecified(value, pos);
                 break;
        case 7:int length = ll.length();
                   System.out.println(length);
                   break;
        case 3:System.out.print("Enter the position");
        	pos = sc.nextInt();
        	ll.deleteElement(pos);
        	break;
        case 4:System.out.println("The List elements are:-");
        	   ll.display();
               break;
        case 6: System.out.println("enter the position");
        	    pos = sc.nextInt();
                 ll.swap(pos);
        case 8:System.exit(1);
       
        default:System.out.println("Invalid selection");
        }
      }
   }	

}
	
    