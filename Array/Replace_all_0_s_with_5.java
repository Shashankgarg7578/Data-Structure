package Array;

public class Replace_all_0_s_with_5 
{
	 int convertfive(int num) {
	        // Your code here
	        int power = 1;
	    int newNum = 0;
	    
	    while(num>0)
	    {
	        int digit = num%10;
	        
	        if(digit == 0)
	        {
	            newNum += 5 * power;
	        }
	        else
	        {
	            newNum += digit * power;
	        }
	        
	        power *= 10;
	        num /= 10;
	    }
	    
	    return newNum;
	    }
	
	public static void main(String[] args) 
	{
		Replace_all_0_s_with_5 R = new Replace_all_0_s_with_5();
		int a = 1004;
		int result = R.convertfive(a);
	    System.out.println(result);
	}

}
