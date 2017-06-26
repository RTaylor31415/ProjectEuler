package problem9;

import java.io.FileNotFoundException;

public class Problem9 {
	public static void main(String[] args) {
		
		System.out.println(SpecialTriplet(1000));

	}
	public static int SpecialTriplet(int n)
	{
		int mult=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				int k=PythChecker(i,j);
				if(k>0)
				{
					if(i+j+k==n)
					{
						mult=i*j*k;
					
					}
				}
			}
		}
		return mult;
	}
	public static int PythChecker(int a, int b)
	{
		double csq = a*a + b*b;
		if((Math.sqrt(csq)%1==0))
		{
		return (int) Math.sqrt(csq);
		}
		else
		{
			return -1;
		}
	}
}
