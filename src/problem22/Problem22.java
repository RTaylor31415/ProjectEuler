package problem22;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem22 {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println(NamesScores());

	}
	public static long NamesScores() throws FileNotFoundException
	{
		long sum=0;
		Scanner s = new Scanner(new File("C:\\Users\\RAT\\workspace\\Euler\\src\\problem22\\numbers.txt"));
		ArrayList<String> al = new ArrayList<String>();
		al = arrayfromstring(s);
		Collections.sort(al);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al.get(i).length();j++)
			{
				sum+=((int)(al.get(i).charAt(j))-64)*(i+1);
			}
		}
		return sum;
	}
	public static ArrayList<String> arrayfromstring(Scanner s)
	{
		s.useDelimiter(",");
		ArrayList<String> al = new ArrayList<String>();
		while(s.hasNext())
		{
			String t = s.next();
			t=t.replaceAll("\"", "");
			al.add(t);
		}
		
		return al;
	}
}
