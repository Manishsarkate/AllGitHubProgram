package functionprogram;

public class addition {
	private static double add(double a, double b)
	{
		return a+b;
		
	}
	public static  int mult(int a, int b)
	{
		return a*b;
		
	}
	protected static  int div(int a, int b)
	{
		return a/b;
		
	}
	public static void main(String[] args)
	{
		
		System.out.println("addition:"+addition.add(20.5,10));
		System.out.println("multification:"+addition.mult(20,10));
		System.out.println("Division:"+addition.div(30,2));
	
	}

}
