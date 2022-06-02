package Java;

public class Multidivision {
	public static void main(String[] argvs)
	{
		Multiplication(); //calling static method 
		Division(151, 7); //calling static method by passing arguments/parameters
	
	}
	public static void Multiplication() // static method without passing arguments/parameters
	{
		int a,b,multiplication;
		a=10;
		b=79;
		multiplication= a*b;
		System.out.println("Multiplication: " +a+ " X " +b+ "="+multiplication);
	}
	
	public static void Division(int a, int b) // static Method with passing arguments/parameters
	{
		int division;
		division= a/b;
		System.out.println("Division: " +a+ "/" +b+ " = "+division);
	}
}
