package functionprogram;

public class methdnonstatic
{
	public void display(char c)
	{
		System.out.println(c);
	}
	public void display(char c ,int num)
	{
		System.out.println(c+""+num);
	}
	public static void main(String[] args)
	{
		methdnonstatic b=new methdnonstatic();
		b.display('a');
		b.display('B', 10);
		

	}

}
