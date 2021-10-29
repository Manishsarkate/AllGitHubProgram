package functionprogram;

public class methodnonstatic1 
{
	void disp(int a, float b)
	{
		System.out.println("integer:" + a);
		System.out.println("Float:" + b);
		// System.out.println(a+" "+b);

	}

	void disp(float a, int b) {
		System.out.println(b + "  " + a);
	}

	public static void main(String[] args) {
		methodnonstatic1 s = new methodnonstatic1();
		s.disp(120, 10.3f);
		// System.out.prrintln("display firdst:"+s.disp(12,12.4f));
		// s.disp(10.0f, 1130);

	}

}
