package problem10;

import java.util.ArrayList;

public class Problem10 {
	static ArrayList checkedprimes = new ArrayList();
	public static void main(String[] args) {
		
		System.out.println(SumPrimes(2000000));

	}
	public static long SumPrimes(int n)
	{
		long sum=0;
		int count=2;
		while(count<n)
		{
			if(IsPrime(count))
			{
				
				sum+=count;
			}
			count++;
		}
		return sum;
	}
	public static boolean IsPrime(long n)
	{
		for(int i=0;i<checkedprimes.size();i++)
		{
			if(n%(long)checkedprimes.get(i)==0)
			{
				return false;
			}
		}
		checkedprimes.add(n);
		return true;
	}
}
