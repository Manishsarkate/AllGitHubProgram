package functionprogram;

public class square 
{

	 
	public int  sqr(int r,int r1)         //non-static method use
	{
		return (r*r1); 
	

		//res=PI*r*r;
		//System.out.println("Area of circle:"+res);		
	}
	public static void main(String[] args)
	{
		
		square a= new square();
	    int id=a.sqr(2,2);
	   System.out.println("sqr:"+id);

	}

}
