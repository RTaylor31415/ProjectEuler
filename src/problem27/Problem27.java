package problem27;

import java.util.ArrayList;

public class Problem27 {
	static ArrayList checkedprimes = new ArrayList();
	public static void main(String[] args)
	{
		System.out.println(QuadraticPrimes(1000));
	}
	public static int QuadraticPrimes(int n)
	{
		int maxprimes=0;
		int maxi=0;
		int maxj=0;
		for(int i=-n;i<n;i++)
		{
			for(int j=-n;j<n;j++)
			{

				int count=numprimes(i,j);
				if(count-1>maxprimes)
				{
					maxprimes=count-1;
					maxi=i;
					maxj=j;

					System.out.println(maxi);
					System.out.println(maxj);

					System.out.println(maxprimes);
				}
			}
		}
		System.out.println(maxi);
		System.out.println(maxj);
		return maxi*maxj;
		
	}
	public static boolean IsPrime(long n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int numprimes(int i, int j)
	{
		boolean prime=true;
		int count=0;
		
		while(prime)
		{
			prime=IsPrime((count*count)+(i*count)+j);
			count++;
		}
		return count-1;
	}
}
