package problem20;

import java.math.BigInteger;

public class Problem20 {
	public static void main(String[] args)
	{
		System.out.println(FactorialDigitSum(100));
	}
	public static int FactorialDigitSum(int i)
	{
		BigInteger fact = BigIntegerFact(i);
		return BigIntegerSum(fact);
	}
	public static int BigIntegerSum(BigInteger i)
	{
		int sum=0;
		while(i.compareTo(BigInteger.valueOf(0))==1)
		{
			sum+=i.remainder(BigInteger.valueOf(10)).intValue();
			i = i.divide(BigInteger.valueOf(10));
		}
		return sum;
	}
	public static BigInteger BigIntegerFact(int num)
	{
		BigInteger start = BigInteger.valueOf(num);
		for(int i=num-1;i>0;i--)
		{
			start=start.multiply(BigInteger.valueOf(i));
		}
		return start;
		
	}
}
