package problem24;

import java.util.ArrayList;
import java.util.Collections;

public class Problem24 {
	public static void main(String[] args)
	{
		System.out.println(LexiPerm("0123456789",1000000));
	}
	public static ArrayList LexiPerm(String n,int num)
	{
		ArrayList al = stringtoarray(n);
		ArrayList perm = permutate(al,num);
		return perm;
	}
	public static ArrayList stringtoarray(String n)
	{
		ArrayList al = new ArrayList();
		for(int i=0;i<n.length();i++)
		{
			al.add(Character.getNumericValue(n.charAt(i)));
		}
		return al;
	}
	public static ArrayList permutate(ArrayList<Integer> al,int num)
	{
		int switches=1;

		while(switches<num)
		{
			int placeholder=al.size()-2;
			int bigger = smallestbigger(al,placeholder);

			if(bigger>0)
			{

				int temp=al.get(bigger);
				al.set(bigger, al.get(placeholder));
				al.set(placeholder, temp);
				switches++;

			}
			else
			{
				while(bigger<0)
				{
					placeholder--;
					bigger = smallestbigger(al,placeholder);
				}

				int temp=al.get(bigger);
				al.set(bigger, al.get(placeholder));
				al.set(placeholder, temp);
				Collections.sort(al.subList(placeholder+1, al.size()));
				switches++;

				placeholder=al.size()-2;

				
			}
		}
		return al;
	}
	public static int smallestbigger(ArrayList<Integer> al,int num)
	{
		int smallest=-1;
		for(int i=num;i<al.size();i++)
		{
			if(al.get(i)>al.get(num))
			{
				smallest=i;
			}
		}
		return smallest;
	}
}
