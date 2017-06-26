package problem17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem17 {
	static List<String> numbers = new ArrayList<>(Arrays.asList("zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"));
	static List<String> numbers2 = new ArrayList<>(Arrays.asList("zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"));
	static String hundred = "hundred";
	static String hundredand = "hundredand";
	static String onethousand = "onethousand";
	public static void main(String[] args)
	{
		System.out.println(lettercounts(1000));
	}
	public static int lettercounts(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=lettercount(i);
		}
		return sum;
	}
	public static int lettercount(int num)
	{
		int count=0;
		int tempnum=0;
		if(num==1000)
		{
			return onethousand.length();
		}
		if(num>=100)
		{
			tempnum=num/100;
			count+=numbers.get(tempnum).length();
			if(num%100==0)
			{
				count+=hundred.length();
			}
			else
			{
				count+=hundredand.length();
			}
			num=num%100;
		}
		if(num>20)
		{
			tempnum=num/10;
			count+=numbers2.get(tempnum).length();
			num=num%10;
		}
		if(num<=20&&num>=1)
		{
			count+=numbers.get(num).length();
		}
		return count;
		
	}
}
