package problem8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println(LargestProduct(4));

	}
	public static int LargestProduct(int n) throws FileNotFoundException
	{
		int mult=0;
		Scanner s = new Scanner(new File("numbers.txt"));
		ArrayList<Integer> al = new ArrayList<Integer>();
		arrayfromfile(s);
		
		return mult;
	}
	public static ArrayList<Integer> arrayfromfile(Scanner s)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		s.useDelimiter("");
		while(s.hasNext())
		{
			al.add(Integer.parseInt(s.next()));
		}
		
		return al;
	}
}
