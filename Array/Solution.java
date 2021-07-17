package Array;

import java.util.*;

public class Solution
{
	
	public StringBuffer sort(String str)
	{
		StringBuffer alpha = new StringBuffer(),
		        num = new StringBuffer()
		        ,alpha1 = new StringBuffer()
		        		,num1 = new StringBuffer(),
		        				result = new StringBuffer()
				        
		        ;
		         
		        for (int i=0; i<str.length(); i++)
		        {
		            if (Character.isDigit(str.charAt(i)))
		                num.append(str.charAt(i));
		            else if(Character.isAlphabetic(str.charAt(i)))
		                alpha.append(str.charAt(i));
		        }
		        
		        
		        
		        for(int a=0 ; a<alpha.length();a++ )
		        {
		        	if(a%2 != 0)
		        	{
		        		alpha1.append(alpha.charAt(a));
		        		
		        	}
		        }

		        for(int a=0 ; a<alpha.length();a++ )
		        {
		        	if(a%2 == 0)
		        	{
		        		alpha1.append(alpha.charAt(a));
		        		
		        	}
		        }
		        
		        for(int a=0 ; a<num.length();a++ )
		        {
		        	if(a%2 == 0)
		        	{
		        		num1.append(num.charAt(a));
		        	}
		        }

		        for(int a=0 ; a<num.length();a++ )
		        {
		        	if(a%2 != 0)
		        	{	num1.append(num.charAt(a));
		        	}
		        }
		        
	result = alpha1.append(num1);
		        
		        
		return result;
	}
	
    public static void main(String[] args) 
    {// Write your code here
    	Solution sol = new Solution();    

    
    	Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            for(int q=0;q<x ;q++)
            {
            	String s = scan.next();
            	
            	if(s.matches("[a-zA-Z0-9]*"))
            	{
            		StringBuffer finalres = new StringBuffer(),
            			    
            		fiinalres = 	sol.sort(s);
            		System.out.println(fiinalres);
            	}
            	else {
            		continue;
            	}
            	
            }
            
            scan.close();
     }
}