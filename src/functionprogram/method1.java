package functionprogram;

public class method1 {
	static double salary=122.33;
	static int empId=121;
	public static int printEmpId()
	{
		return 121;
	}

	public static void main(String[] args) 
	{
		System.out.println("EmpId:"+method1.empId);//print employee Id
		
		method1.printEmpId();
		System.out.println("printEmpId:"+printEmpId());
		int id=method1.printEmpId();
		System.out.println("Emp:"+id);
		
		System.out.println("Salary:"+method1.salary);//print salary
		
		
	
		
	}

}
