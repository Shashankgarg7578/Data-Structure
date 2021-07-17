package Queue;

import java.util.Scanner;

public class DeQueueOperation 
{
	static Scanner sc = new Scanner(System.in);
	static int dequeue[],size,front=-1,rear=-1;
	static 
	{
		DeQueueOperation.creation();
	}
	
	static void creation()
	{
		System.out.print("Enter the Size of Dequeue:-");
		size  = sc.nextInt();
		DeQueueOperation.dequeue = new int[size];
		System.out.println("Dequeue create with size :-"+size);
	}
	static void  insertfront(int iteam)
	{
		if(front==0 && rear==size-1 || (front==rear+1))
		{
			System.out.println("Dequeue if full");
		}
		else if(front==-1&&rear==-1)
		{
			front=rear=0;
			dequeue[front]= iteam;
		}
		else if(front==0)
		{
			front = size-1;
			dequeue[front]= iteam;
		}
		else
		{
			front--;
			dequeue[front] = iteam;
		}
	}
	
	static void  insertrear(int iteam)
	{
		if(front==0 && rear==size-1 || (front==rear+1))
		{
			System.out.println("Dequeue if full");
		}
		else if(front==-1&&rear==-1)
		{
			front=rear=0;
			dequeue[rear]= iteam;
		}
		else if(rear==size-1)
		{
			rear=0;
			dequeue[rear]=iteam;
		}
		else
		{
		  rear++;
		  dequeue[rear]=iteam;
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
	           	System.out.println(DeQueueOperation.dequeue[i]);
	           }
	         System.out.println(DeQueueOperation.dequeue[rear]);
		   }
	  }
	static void getfront()
	{
		if(front == -1 && rear == -1)
		   {
			   System.out.println("Cqueue is empty");
		   }
		   else
		   {
			   System.out.println(dequeue[front]);
		   }
	}
	
	static void getrear()
	{
		if(front == -1 && rear == -1)
		   {
			   System.out.println("Cqueue is empty");
		   }
		   else
		   {
			   System.out.println(dequeue[rear]);
		   }
	}
	
	static void delfront()
	{
		if(front == -1 && rear == -1)
		   {
			   System.out.println("Cqueue is empty");
		   }
		else if(front==rear)
		{
			front = rear=-1;
			System.out.println(dequeue[front]);
		}
		else if(front==size-1)
		{

			System.out.println(dequeue[front]);
			front=0;
		}
		else
		{
			System.out.println(dequeue[front]);
		     front++;
		}
	}
	
	static void delrear()
	{
		if(front == -1 && rear == -1)
		   {
			   System.out.println("Cqueue is empty");
		   }
		else if(front==rear)
		{
			front = rear=-1;
			System.out.println(dequeue[front]);
		}
		else if(rear==0)
		{
			System.out.println();
			rear = size-1;
			
		}
		else
		{
			System.out.println(dequeue[rear]);
			rear--;
		}
	}
  public static void main(String[] args) 
  {
	while(true)
	{
		int iteam;
		System.out.println("1.insert Front");
		System.out.println("2.insert Rear");
		System.out.println("3.delete Front");
		System.out.println("4.delete Rear");
		System.out.println("5.Get Front value");
		System.out.println("6.Get Rear value");
		System.out.println("7.Display");
		System.out.println("8.Exit");
		
		System.out.print("Enter your choice :-");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter a number :-");
			iteam = sc.nextInt();
			DeQueueOperation.insertfront(iteam);
			break;
		case 2:System.out.println("Enter a number :-");
		       iteam = sc.nextInt();
		       DeQueueOperation.insertrear(iteam);
		       break;
		case 3:
			DeQueueOperation.delfront();
			break;
		case 4:
			DeQueueOperation.delrear();
			break;
		case 5:
			DeQueueOperation.getfront();
			break;
		case 6:
			DeQueueOperation.getrear();
			break;
		case 7:
		DeQueueOperation.display();
		break;
		case 8:System.exit(1);
		default:System.out.println("Invalid Choice");
		}
	}

  }
}
