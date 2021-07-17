package Array;

import java.util.HashSet;
import java.util.Set;

public class IntDupicateValue_03 
{
 public static void main(String[] args) 
 {
   int a[] = {4,3,1,6,3,6,9,5,6,6,6,6};
   
   //First and Bad Approch
   System.out.print("Duplicate Values are:- ");
   for(int i=0 ;i<a.length-1;i++)
   {
	  for(int j=i+1; j<a.length;j++)
	  {
		  if((a[i]==a[j]) && (j<i))
		  {
			  break;
		  }
		  if(a[i]==a[j] )
		  {
			  System.out.println(a[i]);
		  }
	  }
   }
   
  
 }
}
