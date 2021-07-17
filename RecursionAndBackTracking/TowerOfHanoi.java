package RecursionAndBackTracking;
public class TowerOfHanoi 
{
 public static void TOH(int n,char BEG,char END,char AUX)
  {
	if(n<=1)
	{
		System.out.println("Move disk 1 from rod "+BEG+" to rod "+END);
	    return;
	}
	
	TOH(n-1,BEG,AUX,END);
	System.out.println("Move disk "+n+" from rod "+BEG+" to rod "+END);
	TOH(n-1,AUX,END,BEG);
	
  }

public static void main(String[] args) 
{
	int n=3;
	TowerOfHanoi.TOH(n,'a','b','c');
}

}
