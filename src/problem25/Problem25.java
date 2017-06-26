package problem25;

import java.math.BigInteger;

public class Problem25 {
	public static void main(String[] args)
	{
		System.out.println(Fibonacci(1000));
	}
	public static int Fibonacci(int max)
	{
		BigInteger n = BigInteger.valueOf(1);
		BigInteger k= BigInteger.valueOf(2);
		BigInteger j= BigInteger.valueOf(3);
		int digits=0;
		int count = 4;
		while(digits<max-1)
		{
			BigInteger temp1=j;

			j=j.add(k);
			n=k;
			k=temp1;
			count++;
			digits=j.toString().length()-1;
			
		}
		return count;
	}
}
