package problem3;

public class Problem3 {

	public static void main(String[] args) {
		System.out.println(largestprimefactor(600851475143L));

	}
	public static long largestprimefactor(long num)
	{
		long largest=0;
		long i=2;
		while(i<num/2)
		{
			if(num%i==0)
			{
				largest=i;
				num=num/i;
				i=1;
			}
			i++;
		}
		if(num>largest)
		{
			largest=num;
		}
		return largest;
	}
	
}
