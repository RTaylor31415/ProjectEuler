package problem21;

import java.util.ArrayList;

public class Problem21 {
	public static void main(String[] args)
	{
		System.out.println(AmicableSum(10000));
	}
	public static int AmicableSum(int num)
	{
		int sum=0;
		for(int i=2;i<num;i++)
		{
			if(amicable(i))
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static boolean amicable(int i)
	{
		ArrayList<Integer> al = factors(i);
		int sum = ArraySum(al);
		ArrayList<Integer> al2 = factors(sum);
		int sum2 = ArraySum(al2);
		return(sum2==i&&i!=sum);
	}
	public static ArrayList<Integer> factors(int num)
	{
		ArrayList al=new ArrayList();
		
		for(int i=1;i<=num/2+1;i++)
		{
			if(num%i==0)
			{
				if(!al.contains(i))
				{
					al.add(i);
				}
				if(!al.contains(num/i))
				{
					al.add(num/i);
				}
			}
		}
		al.remove((Integer) num);
		return al;
	}
	public static int ArraySum(ArrayList<Integer> al)
	{
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum+=al.get(i);
		}
		return sum;
	}
}
