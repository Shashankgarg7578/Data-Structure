package Array;

public class ReverseArray_05
{
  public static void main(String[] args) 
  {
	 int a[] = {6,3,8,1,4,9,2,7};
	 
	 for(int i=0;i<=a.length-1;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	
	 System.out.println();
	
	 for(int i=a.length-1;i>=0;i--)
	 {
		 System.out.print(a[i]+" ");
	 }
	 
		
  }
}
