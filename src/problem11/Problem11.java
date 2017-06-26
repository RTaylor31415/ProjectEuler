package problem11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println(LargestProductInGrid(4));

	}
	public static int LargestProductInGrid(int n) throws FileNotFoundException
	{
		Scanner s = new Scanner(new File("C:\\Users\\RAT\\workspace\\Euler\\src\\problem11\\numbers.txt"));
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		al = arrayfromfile2d(s);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(updownmult(al,n));
		al2.add(leftrightmult(al,n));
		al2.add(diagonalmult(al,n));
		al2.add(diagonalupmult(al,n));
		int mult = Collections.max(al2);
		
		
		return mult;
	}

	public static ArrayList<ArrayList<Integer>> arrayfromfile2d(Scanner s)
	{
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		while(s.hasNextLine())
		{
			String t = s.nextLine();
			String[] splitStr = t.split("\\s+");
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			for(int i=0;i<splitStr.length-1;i++)
			{
				try{
				al2.add(Integer.parseInt(splitStr[i]));
				}
				catch(NumberFormatException e)
				{
					
				}
			}
			al.add(al2);
			
		}
		
		return al;
	}
	public static int updownmult(ArrayList<ArrayList<Integer>> al, int n)
	{
		int mult=0;
		for(int j=0;j<al.get(0).size()-1;j++)
		{
			for(int i=0;i<al.size()-1-n;i++)
			{

				int temp = 1;
				for(int k=0;k<n;k++)
				{
					temp*=al.get(i+k).get(j);
					
				}
				if(temp>mult)
				{
					mult=temp;
				}
			}
		}
		return mult;
	}
	public static int leftrightmult(ArrayList<ArrayList<Integer>> al, int n)
	{
		int mult=0;
		for(int i=0;i<al.size()-1;i++)
		{
			for(int j=0;j<al.get(i).size()-n-1;j++)
			{
			

				int temp = 1;
				for(int k=0;k<n;k++)
				{
					temp*=al.get(i).get(j+k);
					
				}
				if(temp>mult)
				{
					mult=temp;
				}
			}
		}
		return mult;
	}
	private static int diagonalmult(ArrayList<ArrayList<Integer>> al, int n) {
		int mult=0;
		for(int i=0;i<al.size()-n-1;i++)
		{
			for(int j=0;j<al.get(i).size()-n-1;j++)
			{
			

				int temp = 1;
				for(int k=0;k<n;k++)
				{
					temp*=al.get(i+k).get(j+k);
					
				}
				if(temp>mult)
				{
					mult=temp;
				}
			}
		}
		return mult;
	}
	private static int diagonalupmult(ArrayList<ArrayList<Integer>> al, int n) {
		int mult=0;
		for(int i=n-1;i<al.size()-1;i++)
		{
			for(int j=0;j<al.get(i).size()-n-1;j++)
			{
			

				int temp = 1;
				for(int k=0;k<n;k++)
				{
					temp*=al.get(i-k).get(j+k);
					
				}
				if(temp>mult)
				{
					mult=temp;
				}
			}
		}
		return mult;
	}
}
