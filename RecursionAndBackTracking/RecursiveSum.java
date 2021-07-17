package RecursionAndBackTracking;

public class RecursiveSum 
{
	public static int fun(int a)
	{ 
	  if(a<=1)
	  return a;  	 
	  return  a+fun(a-1);
	}
public static void main(String[] args) 
{  
	int x = RecursiveSum.fun(3);
	System.out.println(x);
   
}
}
