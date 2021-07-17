package Array;

public class Binary_Array_Sorting
{
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
	} 
	
	public static void main(String[] args) 
	{
		Binary_Array_Sorting B = new Binary_Array_Sorting();
		int a[] = {1,0,1,1,1,1,1,0,0,0};
		int n = a.length;
		int a1[] = B.SortBinaryArray(a, n);
		for(int k=0 ; k<a1.length ;k++)
		{
			System.out.print(a1[k]+" ");
		}
	}
}
