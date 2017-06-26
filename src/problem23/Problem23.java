package problem23;

import java.util.ArrayList;

public class Problem23 {
	public static void main(String[] args)
	{
		System.out.println(NonAbundantSums(28123));
	}
	public static long NonAbundantSums(int num)
	{
		ArrayList<Integer> al=abundantlist(num);

		ArrayList<Integer> al2=abundantlistsum(al);
		long sum=0;
		for(int i=1;i<=num;i++)
		{
			if(!al2.contains(i))
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static boolean Abundant(int num)
	{
		ArrayList<Integer> al = factors(num);
		int sum = ArraySum(al);
		return (sum>num);
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
	public static ArrayList<Integer> abundantlist(int num)
	{
		ArrayList al=new ArrayList();
		for(int i=2;i<=num;i++)
		{
			if(Abundant(i))
			{
				al.add(i);
			}
			
		}
		return al;
	}
	public static ArrayList<Integer> abundantlistsum(ArrayList<Integer> al)
	{
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			if(i%100==0)
			{
				System.out.println(i);
			}
			for(int j=0;j<al.size();j++)
			{
				if(!al2.contains(al.get(i)+al.get(j)))
				{
					al2.add(al.get(i)+al.get(j));
				}
			}
		}
		return al2;
	}
	
}
