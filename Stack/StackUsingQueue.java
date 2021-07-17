package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue 
{
   private Queue<Integer> q1 = new LinkedList<Integer>();
   private Queue<Integer> q2 = new LinkedList<Integer>();
   private int size =0;
 
   public void push(int data)
   {
	   q2.add(data);
	   size++;
	   
	   while(!q1.isEmpty())
	   {
		   q2.add(q1.remove());
	   }
	   Queue<Integer> temp = q1 ;
	   q1 = q2;
	   q2 = temp;
   }
   
   public int pop() throws Exception
   {
	 if(q1.isEmpty())
	 {
		 throw new Exception("The Stack is empty");
	 }
	 size--;
	 return q1.remove();
	  
   }
  public static void main(String[] args) throws Exception 
  {
	StackUsingQueue sq = new StackUsingQueue();
	sq.push(10);
	sq.push(15);
	sq.push(45);
	sq.push(32);
	sq.push(76);
	System.out.println(sq.pop());
	System.out.println(sq.pop());
	System.out.println(sq.pop());
	
	
  }
}
