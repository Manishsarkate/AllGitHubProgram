package functionprogram;

public class tringle 
{
	 //   int area;
	       int Triangle(int b,int h)//non static method or function use
		{
			
			int a= b*h/2;
			System.out.println("rectangle:"+a);
			return a;
			
		}
		
		public static void main(String[] args) 
		{
			tringle t = new tringle();
			System.out.println(" area 	tringle:"+t.Triangle(12,2));	
			//System.out.println("rectangle:"+t.Triangle(2,2));
			
			//System.out.println("rectangle:"+t.area);
			
			
			
			
			
			t.Triangle(30,2);
			
			
			//t.Triangle(12,2);			
			
			//t.Triangle(12,2);			
			
		
		}

}
