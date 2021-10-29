package functionprogram;

public class methooverloading 
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		int res=a*b*c;
		System.out.println("multi:"+res);
		return res;
	}
	public void demo(float num1)
	{
		float res=num1-num1;
		System.out.println("demo:"+res);
	}

	public static void main(String[] args)
	{
		methooverloading v=new methooverloading();
		System.out.println("add:"+v.add(5,3));
		System.out.println("multi:"+v.add(5,3,2));
	    v.demo(12.0f);
		
	}

}
