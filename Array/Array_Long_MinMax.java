package Array;

public class Array_Long_MinMax
{
	 int getMinMax(long a[], long n)  
    {
		 long min = a[0];
        for(long i=1 ; i<n ; i++)
        {
              if(min>a[(int) i])            
              {
            	 min = a[(int) i];
              }
        }
		return (int) min;
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Array_Long_MinMax  A = new Array_Long_MinMax ();
		long arrr[] = {10, 11, 1, 2, 3};
		long n = arrr.length;
		 int result=  A.getMinMax(arrr, n);
		 System.out.println(result);
	}

}
