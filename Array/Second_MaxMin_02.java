package Array;

public class Second_MaxMin_02 
{
  public static void main(String[] args) 
  {
    int arr[] = {10,3,4,1,9,5,7,2,8,6};
    int temp;
    
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if(arr[i]>arr[j])
    		{
    			temp = arr[i];
    			arr[i]=arr[j];
    			arr[j] = temp;
    		}
    	}
    }
    System.out.println("min element:- "+arr[1]);
    System.out.println("max element:- "+(arr.length-1));
    
  }
}
