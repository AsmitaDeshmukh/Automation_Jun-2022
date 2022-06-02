package AbstractClass_ConcreteClass;

public class abstract_concreteclass extends abstractclass{
	public void m2()
	{
		System.out.println("Running abstract method from concrete class:m2");
	}

	public static void main(String[] args)
	{
		abstract_concreteclass c1 = new abstract_concreteclass();
		c1.m2();
		c1.m1();
	}
}
