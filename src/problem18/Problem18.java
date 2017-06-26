package problem18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem18 {
	public static void main(String[] args) throws FileNotFoundException {

		System.out.println(MaximumPathSum(15));

	}

	private static int MaximumPathSum(int n) throws FileNotFoundException {
		Scanner s = new Scanner(new File("C:\\Users\\RAT\\workspace\\Euler\\src\\problem18\\numbers.txt"));
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		al = arrayfromfile2d(s);
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<al.get(i).size()-1;j++)
			{
				int currentnode = al.get(i).get(j);
				int nextnode = al.get(i).get(j+1);
				int abovenode = al.get(i-1).get(j);
				if(currentnode>=nextnode)
				{
					
					al.get(i-1).set(j, abovenode+currentnode);
				}
				else
				{
					al.get(i-1).set(j, abovenode+nextnode);
				}
			}
		}
		return al.get(0).get(0);
	}
	public static ArrayList<ArrayList<Integer>> arrayfromfile2d(Scanner s)
	{
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		while(s.hasNextLine())
		{
			String t = s.nextLine();
			String[] splitStr = t.split("\\s+");
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			for(int i=0;i<splitStr.length;i++)
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
}
