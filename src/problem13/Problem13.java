package problem13;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println(LargeSum(100));

	}

	public static BigInteger LargeSum(int n) throws FileNotFoundException
	{
		BigInteger sum;
		sum = BigInteger.valueOf(0);
		Scanner s = new Scanner(new File("C:\\Users\\RAT\\workspace\\Euler\\src\\problem13\\numbers.txt"));
		ArrayList<BigInteger> al = new ArrayList<BigInteger>();
		al = arrayfromfile(s);
		
		for(int i=0;i<n;i++)
		{
			sum = sum.add(al.get(i));
		}
		
		return sum;
	}
	public static ArrayList<BigInteger> arrayfromfile(Scanner s)
	{
		ArrayList<BigInteger> al = new ArrayList<BigInteger>();
		while(s.hasNextLine())
		{
			String t = s.nextLine();
					BigInteger number = new BigInteger(t);
					al.add(number);
			
		}
		
		return al;
	}
	
}
