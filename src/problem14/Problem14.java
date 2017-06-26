package problem14;

public class Problem14 {
	public static void main(String[] args)
	{
		System.out.println(LargestCollatzSequence(1000000));
	}

	private static int LargestCollatzSequence(int n) {
		int longest=1;
		int num=1;
		
		for(int i=1;i<n;i++)
		{
			if(CollatzSequence(i)>longest)
			{
				longest=CollatzSequence(i);
				num=i;
				System.out.println(num);
				System.out.println(longest);
				
			}
		}
		return num;
		
	}
	private static int CollatzSequence(long n)
	{
		int count=0;
		while(n>1)
		{
			if(n%2==0)
			{
				n/=2;
			}
			else
			{
				n = n*3+1;
			}
			count++;
		}
		return count+1;
	}
}
