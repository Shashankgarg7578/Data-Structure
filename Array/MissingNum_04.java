package Array;

public class MissingNum_04 
{
  public static void main(String[] args) 
  {
	int a[] = {1,2,3,5,6};
	
	int Expected_no_elements = a.length+1;
	int total_sum_array = (Expected_no_elements*(Expected_no_elements+1))/2;
    

	int sum=0;
	
	for(int i=0; i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Total sum for Expected :- "+total_sum_array);
	System.out.println("Given array sum :-"+sum);
	int x = total_sum_array-sum;
	System.out.println("Missing No. is :- "+x);
	System.out.println("index is:- "+(x-1));
	
  }
}
