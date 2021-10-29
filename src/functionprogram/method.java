package functionprogram;

public class method 
{
	static int salary=121;
	int empId=121212;
	public static int add(int a,int b)
	{
		return a+b;
	}
	public int multi(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args)
	{
		System.out.println("salary:"+method.salary);
		
		method obj=new method();
		System.out.println("emp:"+obj.empId);
		
		System.out.println("adition:"+method.add(2,20));
		System.out.println("adition:"+obj.multi(20,2));
		System.out.println("adition:"+obj.div(20,2));	
		
		
		

	}

}
