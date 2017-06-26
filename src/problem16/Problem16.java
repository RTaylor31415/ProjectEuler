package problem16;

import java.math.BigInteger;

public class Problem16 {
	public static void main(String[] args)
	{
		System.out.println(PowerDigitSum(1000));
	}

	private static int PowerDigitSum(int i) {
		BigInteger mult = new BigInteger("2");
		return BigIntegerSum(mult.pow(i));
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

}
