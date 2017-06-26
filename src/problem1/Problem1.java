package problem1;

import java.util.ArrayList;


public class Problem1 {

	static ArrayList checkedprimes = new ArrayList();
	public static void main(String[] args) {
		
		System.out.println(sumofmult(1000));
	}
	public static int sumofmult(int max)
	{
		int sum=0;
		for(int i=0;i<max;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
