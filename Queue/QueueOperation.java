package Queue;

import java.util.Scanner;

class QueueOperation
{
static Scanner sc = new Scanner(System.in);
static int queue[],front,rear,size;

static
{
	QueueOperation.creation();	
}
 static void creation() 
{
  System.out.print("Enter a size of Queue :-");
  size = sc.nextInt();
  QueueOperation.queue = new int[size];
  System.out.println("Queue created with size :"+size);
}

 static void inserted(int iteam)
 {
	 if(size == rear)
	 {
		 System.out.println("Queue is full");
	 }
	 else
	 {
		 QueueOperation.queue[rear]=iteam; 
		 rear++;
	 }
 }
 
 static void deleted()
 {
	 if(front == rear)
	 {
		 System.out.println("Queue is empty");
	 }
	 else
	 {
		 System.out.println("deleted iteam :-"+queue[front]);
		 for(int i=0;i<size-1;i++)
		 {
			 QueueOperation.queue[i]= QueueOperation.queue[i+1];
		 }
		 rear--;
	 }
 }
 
 static void traverse()
 {
	 if(front == rear)
	 {
		 System.out.println("Queue is empty");
	 }
	 else
	 {
		 System.out.println("elements are");
		 for(int i=0;i<size;i++)
		 {
			System.out.println(queue[i]);
		 }
	 }
 }
 
 public static void main(String[] args) 
 {
	while(true)
	{
		int iteam;
		System.out.println("1.inserted");
		System.out.println("2.deleted");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		
		System.out.print("Enter your choice :-");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:  System.out.print("Enter a element :");
			     iteam = sc.nextInt();
		        QueueOperation.inserted(iteam);
			    break;
		case 2: QueueOperation.deleted();
			    break;
		case 3: QueueOperation.traverse();
			    break;
		case 4: System.exit(1);
		default:System.out.println("Invalid Choice");
		}
	}
 }
}
