package Java;

public class ConstructorExample {
	public static void main (String[] argvs)
	{
		ConstructorExample ex1= new ConstructorExample();
		ConstructorExample ex2= new ConstructorExample(21,"M. A. Deshmukh");
		ConstructorExample ex3= new ConstructorExample(21,"S. A. Deshmukh", "Sales Dept");
	}
	public ConstructorExample()
	{
		int employeeno;
		String employeename;
		String empldept;
		employeeno= 11;
		employeename= "A. A. Deshmukh";
		empldept ="Computer Dept";
		System.out.println("Constructor without Parameters");
		System.out.println("--------------------------------------------");
		System.out.println("Employee Code: "+employeeno);
		System.out.println("Employee Name: "+employeename);
		System.out.println("Employee Code: "+empldept);
		System.out.println("--------------------------------------------");
	}
	
	public ConstructorExample(int employeeno, String employeename)
	{
		System.out.println("Constructor with 2 Parameters");
		System.out.println("--------------------------------------------");
		System.out.println("Employee Code: "+employeeno);
		System.out.println("Employee Name: "+employeename);
		System.out.println("--------------------------------------------");
	}
	public ConstructorExample(int employeeno, String employeename, String empdept)
	{
		System.out.println("Constructor with 3 Parameters");
		System.out.println("--------------------------------------------");
		System.out.println("Employee Code: "+employeeno);
		System.out.println("Employee Name: "+employeename);
		System.out.println("Employee Code: "+empdept);
		System.out.println("--------------------------------------------");
	}
}
