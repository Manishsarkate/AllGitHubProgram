package functionprogram;// no return value in method overloading

public class methdoverloading1 
{
	static double res;
	public static void sqr()
	{
		int a=3,b=3;
		res=a*b;
		System.out.println("Square is:"+res);
	}
	public static void add(int a,int b)
	{
		res=a+b;
		System.out.println("Addition is :"+res);
	}
	public static void add(float a,float b)
	{
		res=a+b;
		System.out.println("Addition is floating value :"+res);
	}
	

	public static void main(String[] args) 
	{
		//methdoverloading1 v1=new methdoverloading1 ();
		methdoverloading1 .sqr();
		methdoverloading1 .add(10,20);
		methdoverloading1 .add(10.0f,20.0f);
		

	}

}
