package problem7;

import java.util.ArrayList;

public class Problem7 {
	static ArrayList checkedprimes = new ArrayList();
	public static void main(String[] args) {
		System.out.println(NthPrime(10001));

	}
	public static long NthPrime(long n)
	{
		long prime=0;
		long i=1;
		while(prime<10001)
		{
			i++;
			if(IsPrime(i))
			{
				prime++;
			}
			
		}
		return i;
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
