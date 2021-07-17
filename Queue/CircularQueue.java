package Queue;

import java.util.Scanner;

public class CircularQueue 
{
	static Scanner sc = new Scanner(System.in);
	static int front=-1,rear=-1,cqueue[],size;
	
	static
	{
		CircularQueue.creation();
	}
	
   static void creation()
   {
	   System.out.print("Enter the size of Queue :-");
	   size = sc.nextInt();
	   CircularQueue.cqueue = new int[size];
	   System.out.println("CQueue created with size:-"+size);
   }
	
   static void inserted(int iteam)
   {
	   if(front==((rear+1)%size) || rear == size-1)
	   {
		  System.out.println("CQueue is full"); 
	   }
	   else if(front == -1 && rear == -1)
	   {
		   front = rear = 0;
		   CircularQueue.cqueue[rear]=iteam;
	   }
	   else 
	   {
		   rear = (rear+1)%size;
		   CircularQueue.cqueue[rear]=iteam;
	   }	   
   }
    
  static void deleted()
  {
	  if(front == -1 && rear == -1)
	  {
		  System.out.println("Cqueue is Empty");
	  }
	  else if(front == rear)
	  {
	 System.out.println(cqueue[front]);
		  	front  = rear = -1;
	  }
	  else
	  {
		 System.out.println(cqueue[front]);
		 front = (front+1)%size;
	  }  
  }
  
  static void display()
  {
	   if(front == -1 && rear == -1)
	   {
		   System.out.println("Cqueue is empty");
	   }
	   else
	   {
		   System.out.println("Queue is");
         for(int i=front;i<size-1;i=((i+1)%size))
           {
           	System.out.println(CircularQueue.cqueue[i]);
           }
         System.out.println(CircularQueue.cqueue[rear]);
	   }
  }

  static void peek()
  {
	   System.out.println(CircularQueue.cqueue[front]);
  }
  
	public static void main(String[] args)
	{
		while(true)
		{
			int iteam;
			System.out.println("1.inserted");
			System.out.println("2.deleted");
			System.out.println("3.display");
			System.out.println("4.peek");
			System.out.println("5.Exit");
			System.out.print("Enter your Choice:-"); 
			int choice = sc.nextInt();
			 switch(choice)
			 {
			 case 1: System.out.print("Enter a element :");
		             iteam = sc.nextInt();
				     CircularQueue.inserted(iteam);
				     break;
			 case 2:CircularQueue.deleted();
			        break;
			 case 3:CircularQueue.display();
		            break;
			 case 4:CircularQueue.peek();
		            break;
			 case 5:System.exit(1);
			        break;
			        default:System.out.println("invalid selection");
			 }	
		}
	}
}
