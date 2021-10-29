package functionprogram;

public class area
{	
	double PI=3.14;                       //res varible add 
	public double areaofcirce(double r)         //non-static method use
	{
		return (PI*r*r);                  //data type is interger then the return value otherwise no return value

		//res=PI*r*r;
		//System.out.println("Area of circle:"+res);
				
	}

	public static void main(String[] args)  
	{
		area a= new area();
	    double id=a.areaofcirce(10);
	   System.out.println("Area of circle:"+id);

	}

}
