package problem28;

public class Problem28 {
	public static void main(String[] args)
	{
		System.out.println(NumberSpiral(1001));
	}
	public static int NumberSpiral(int num)
	{
		int sum=1;
		int currentnumber=1;
		for(int i=1;i<num/2+1;i++)
		{
			for(int j=0;j<4;j++)
			{
				currentnumber+=2*i;
				sum+=currentnumber;
			}
		}
		return sum;
	}
}
