package problem5;

import java.util.ArrayList;
import java.util.Collections;

public class Problem5 {
	public static void main(String[] args) {
		System.out.println(SmallestMultiple(20));

	}
	public static int SmallestMultiple(int num)
	{
		int mult=1;
		ArrayList unusedprimes = new ArrayList();
		for(int i=1;i<num;i++)
		{
			ArrayList al = primefactors(i);
			for(Object prime: al)
			{
				if(!unusedprimes.contains(prime))
				{
					unusedprimes.add(prime);
				}
				if(unusedprimes.contains(prime))
				{
					int temp =(Collections.frequency(al, prime)-Collections.frequency(unusedprimes, prime));
					for(int j=0;j<temp;j++)
					{
						unusedprimes.add(prime);
					}
				}
			}
		}
		for(int i=0;i<unusedprimes.size()-1;i++)
		{
			System.out.println(unusedprimes.get(i));
			mult*=(Integer)unusedprimes.get(i);
		}
		return mult;
	}
	public static ArrayList primefactors(int num)
	{
		ArrayList al=new ArrayList();
		int i=1;
		while(num>1)
		{
			if(num%i==0)
			{
				num=num/i;
				al.add(i);
				i=1;
			}
			i++;
		}
		return al;
	}
}
