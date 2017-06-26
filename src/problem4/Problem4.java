package problem4;

import java.util.ArrayList;

public class Problem4 {
	public static void main(String[] args) {
		System.out.println(LargestPalindromeProduct(999));

	}
	public static int LargestPalindromeProduct(int max)
	{
		int largest=0;
		for(int i=1;i<max;i++)
		{
			for(int j=1;j<max;j++)
			{
				if(Palindromechecker(i*j)&&((i*j)>largest))
				{
					largest=i*j;
				}
			}
		}
		return largest;
		
	}
	public static boolean Palindromechecker(int num)
	{
		ArrayList al = numtoarray(num);
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)!=al.get(al.size()-i-1))
			{
				return false;
			}
		}
		return true;
		
	}
	public static ArrayList numtoarray(int num)
	{
		ArrayList al = new ArrayList();
		while(num>0)
		{
			al.add(0,num%10);
			num/=10;
		}
		return al;
	}
}
