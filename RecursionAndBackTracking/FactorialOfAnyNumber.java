package RecursionAndBackTracking;

public class FactorialOfAnyNumber
{
  static int fact(int n)
  {
	  if(n==0)
	  {
		  return 1;
	  }
	  else
	     return (n*fact(n-1));
	
	  
  }
 public static void main(String[] args) 
 {
	int fact = FactorialOfAnyNumber.fact(5);
	System.out.println(fact);
}
}
