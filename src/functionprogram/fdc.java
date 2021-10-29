package functionprogram;

public class fdc
{
	double celc=28;
	public double fhcelc()
	{
		 return(celc*1.8)+32;
	}

	public static void main(String[] args)
	{
	    fdc f=new fdc();
	  double id=f.fhcelc();
	  System.out.println("fahrahneit convert into celc:"+id);
	
	
	}

}
