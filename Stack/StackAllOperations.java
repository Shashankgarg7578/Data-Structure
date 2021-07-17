package Stack;

import java.util.Scanner;
import java.util.Stack;

class StackAllOperations
{
  static Scanner sc = new Scanner(System.in);	
  static int stack[],top=-1,size;
  
  //creation of Stack
  static
  {
   StackAllOperations.create(); 
  }
  
  static void create()
  {
	  
	  System.out.print("Enter size of Stack :");
	  size = StackAllOperations.sc.nextInt();
	  StackAllOperations.stack = new int[size];
	  System.out.println("Stack created with size: "+size);
	  
  }
  
  //Stack Push Operation
  static boolean isFull()
  {
	  if(top==size-1)
	  {
		  return true;
	  }
	  else
		  return false;
  }
  static void push(int iteam)
  {
	  if(StackAllOperations.isFull())
	  {
		  System.out.println("stack is overflow");
	  }
	  else
	  {
		 top++;
		 StackAllOperations.stack[top]=iteam;
	  }
  }
  
  //Stack Pop operation
  static boolean isEmpty()
  {
	  if(top==-1)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	  
  }

  static int pop()
  {
	  if(StackAllOperations.isEmpty())
	  {
		  return 0;
	  }
	  else
	  {
		  return stack[top--];
	  }
  }
  
  //stack peek operation which only show top of the element
  static int peek()
  {
	  if(StackAllOperations.isEmpty())
	  {
		  return 0;
	  }
	  else
	  {
		  return stack[top];
	  }
  }
  
  //Stack traverse means show all elements of the stack
  static void traverse()
  {
	  if(StackAllOperations.isEmpty()) 
	  {
		System.out.println("Stack is Empty");  
	  }
	  else
	  {
		  System.out.println("Element of Stack");
		  try {
		  for(int i = 0 ; i<=top;i++)
		  {
			  System.out.print(stack[i]+" ");
		  }
		  }
		  catch(Exception e)
		  {
			  System.out.println("stack printed");
		  }
	  }
  }
  
  //main method of all operations
	public static void main(String[] args) 
	{
		int iteam;
		while(true)
		{
			System.out.println();
	   	System.out.println("1.Push");
	   	System.out.println("2.Pop");
	   	System.out.println("3.Peek");
	   	System.out.println("4.Traverse");
	   	System.out.println("5.Quit");
	   	
	   	System.out.print("Enter a number :-");
	    int choice = StackAllOperations.sc.nextInt();
        
	    switch(choice)
	    {
	    case 1: System.out.print("Enter element :-");
	            iteam = sc.nextInt() ;
	            StackAllOperations.push(iteam);
	            break;
	    case 2: iteam =  StackAllOperations.pop();
	            if(iteam==0)
	            {
	            	System.out.println("Stack is underflow \n");
	            }
	            else
	            {
	            	System.out.println("Pop item :"+iteam);
	            }
                break;	            
	    case 3: iteam = StackAllOperations.peek();
	    if(iteam==0)
        {
        	System.out.println("Stack is underflow \n");
        }
        else
        {
        	System.out.println("Peek item is :"+iteam);
        }
                break;
	    case 4:  StackAllOperations.traverse();
                break;
	    case 5:System.exit(1);
	    default:System.out.println("Invalid choice selection");
	    }
		}	
	}
}
	
	