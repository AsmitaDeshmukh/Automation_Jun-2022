package thiskeyword;

public class thiskey1 extends thiskeyword {
	int a=10; //public variable of current class
	
	public static void main(String[] argvs)
	{
		thiskey1 obj1 = new thiskey1();
		obj1.printavariable();
	}
	
	public void printavariable()
	{
		int a=35;
		System.out.println(a); //print local variable of current method printavariable
		System.out.println(this.a); //print global variable of current class that is thiskey1
		System.out.println(super.a);//print global variable of super class that is thiskeyword
	}

}
