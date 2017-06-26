package problem6;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println(SumSquareDifference(100));

	}
	public static int SumSquareDifference(int n)
	{
		return SumSquares(n)-SumSquares2(n);
	}
	public static int SumSquares(int n)
	{
		int mult=0;
		for(int i=1;i<=n;i++)
		{
			mult+=i;
		}
		return mult*mult;
	}
	public static int SumSquares2(int n)
	{
		int mult=0;
		for(int i=1;i<=n;i++)
		{
			mult+=i*i;
		}
		return mult;
	}

	
}
