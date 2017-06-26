package problem15;

public class Problem15 {
	public static long l=0;
	public static void main(String[] args)
	{
		System.out.println(LatticePaths(20));
	}

	private static long LatticePaths(int i) {
						
		PathstoEndRecursive(0,0,i);
		return l;
	}
	private static void PathstoEndRecursive(int i, int j, int k) {
		
		if(i<k&&j<k)
		{
			PathstoEndRecursive(i+1,j,k);
			PathstoEndRecursive(i,j+1,k);
		}
		else if(i<k)
		{
			PathstoEndRecursive(i+1,j,k);
		}
		else if(j<k)
		{
			PathstoEndRecursive(i,j+1,k);
		}
		if(i==k&&j==k)
		{
			l++;	
		}
		
	}
	
}
