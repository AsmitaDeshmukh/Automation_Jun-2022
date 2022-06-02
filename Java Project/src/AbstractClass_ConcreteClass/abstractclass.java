package AbstractClass_ConcreteClass;


public abstract class abstractclass {
	// abstract class is incomplete class
	// we can't create object of abstract class
	// Note:- doesn't provide 100% abstraction (it provides partial abstraction)
	public void m1()  //non-abstract or complete method
	{
		System.out.println("running non-abstract method:m1");
	}
	public abstract void m2(); // abstract or incomplete method
}
