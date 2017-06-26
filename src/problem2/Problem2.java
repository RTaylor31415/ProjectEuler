package problem2;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println(sumofevens(4000000));

	}
	public static int sumofevens(int max)
	{
		int n=1;
		int k=2;
		int j=3;
		int sum=0;
		while(j<max)
		{
			int temp1=j;
			if(j%2==0)
			{
				sum+=j;
			}
			j=j+k;
			n=k;
			k=temp1;
			
			
		}
		return sum+2;
	}

}
