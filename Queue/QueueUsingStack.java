package Queue;

import java.util.Stack;

public class QueueUsingStack 
{
 Stack<Integer> s1 = new Stack<Integer>();
 Stack<Integer> s2 = new Stack<Integer>();
 
 public void enqueue(int val)
 {
	 s1.push(val);
 }
 
 public int dequeue()
 {
	 if(s2.size()!=0)
	 {
		 return s2.pop();
	 }
	 
	 if(s1.empty())
	 {
		 return -1;
	 }
	 
	 while(s1.size()!=0)
	 {
		 s2.add(s1.pop());
	 }
	 return s2.pop();
 }
 
 public static void main(String[] args) 
 {
 QueueUsingStack q1 = new QueueUsingStack()	;
 q1.enqueue(7);
 q1.enqueue(3);
q1.enqueue(4);

System.out.println(q1.dequeue());
System.out.println(q1.dequeue());
System.out.println(q1.dequeue());

q1.enqueue(7);
q1.enqueue(8);
System.out.println();

System.out.println(q1.dequeue());
System.out.println(q1.dequeue());

 }
}
