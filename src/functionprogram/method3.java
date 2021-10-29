package functionprogram;

public class method3
{
	static int x=10,y=20,z=10;
	
	public static void main(String[] args)
	{
		double res;
		System.out.println("1st no:"+x);
		System.out.println("2st no:"+y);
		System.out.println("3rd no:"+z);
		res=method3.addiion();
		System.out.println("addition:"+res);

	}
	public static double addiion()
	{
		return(x+y+z);
	}
	
}
