package problem26;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Problem26 {

	public static void main(String[] args)
	{
		System.out.println(ReciprocalCycles(1000));
	}
	public static int ReciprocalCycles(int n)
	{
		int max=1;
		int d=1;
		for(int i=2;i<1000;i++)
		{
			ArrayList al= Reciprocal(i);
			if(al!=null)
			{
				if(al.size()>max)
				{
					max=al.size();
					d=i;

					System.out.println(d);
					System.out.println(al);
				}
			}
		}
		return d;
	}
	public static ArrayList<Integer> Reciprocal(int n)
	{
		BigDecimal num1 = BigDecimal.valueOf(1);
		BigDecimal num2 = BigDecimal.valueOf(n);
		BigDecimal frac = num1.divide(num2,10000,RoundingMode.DOWN);
		ArrayList<Integer> al = new ArrayList();
		
		frac = frac.multiply(BigDecimal.valueOf(1000000000000000000L));
		frac = frac.remainder(BigDecimal.valueOf(1));
		if(frac.compareTo(BigDecimal.valueOf(0))>0)
		{
			al=alfromBigDec(frac);
			return al;
		}
		else
		{
			return null;
		}
	}
	public static ArrayList<Integer> alfromBigDec(BigDecimal num)
	{
		boolean recurring=false;
		String temp=num.toString();
		ArrayList<Integer> al = new ArrayList();
		int startingnumber=Character.getNumericValue(temp.charAt(2));
		al.add(startingnumber);
		int i = 3;
		while(!recurring)
		{
			int nextnumber=Character.getNumericValue(temp.charAt(i));
			al.add(nextnumber);
			if(nextnumber==startingnumber&&Character.getNumericValue(temp.charAt(i+1))==Character.getNumericValue(temp.charAt(3))&&Character.getNumericValue(temp.charAt(i+2))==Character.getNumericValue(temp.charAt(4))&&Character.getNumericValue(temp.charAt(i+3))==Character.getNumericValue(temp.charAt(5)))
			{
				recurring=true;
			}
			i++;
		}
		return al;
	}
}
