package ControlStatement;

public class ifelseif {
	public static void main(String[] argvs)
	{
		int marks;
		marks=70;
		if(marks<40)
		{
			System.out.println("Grade : Fail");
		}
		else if(marks <60)
		{
			System.out.println("Grade : Second Class");
		}
		else if(marks <70)
		{
			System.out.println("Grade : First Class");
		}
		else 
		{
			System.out.println("Grade : Distinction");
		}
	}

}
