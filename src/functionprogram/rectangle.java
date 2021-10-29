package functionprogram;

public class rectangle 
{
    int area;
	public void Reactangle(int w,int h)//non static method use
	{
		
		area=w*h;
		System.out.println("rectangle:"+area);
		
	}


	public static void main(String[] args)
	{
		rectangle r=new rectangle ();
		r. Reactangle(5,10);
	}

}
