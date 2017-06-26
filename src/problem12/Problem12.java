package problem12;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Problem12 {
	public static void main(String[] args)
	{
		System.out.println(HighlyDivisibleTriangle(500));
	}

	public static int HighlyDivisibleTriangle(int n) {
		int i=0;
		int j=1;
		int div=1;
		while(div<=n)
		{

			i+=j;
			j++;
			ArrayList <Integer> al=new ArrayList<Integer>();
			al = factors(i);
			div=al.size();
			System.out.print(div);
			System.out.println(al);
		}
		
		return i;
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
		return al;
	}
	/*
	public static ArrayList<Integer> primefactors(int num)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
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
	public static ArrayList<Integer> divisors(ArrayList<Integer> al2)
	{
		ArrayList<Integer> al=new ArrayList();
		for(int i=1;i<al2.size()-1;i++)
		{
			for(int j=1;j<al2.size()-1;j++)
			{
				
			}
		}
		
		return al;
	}
	*/
}
