package Casting;

public class Upcasting {
	public static void main(String[] args)
	{
		//Upcasting 
		//here father class object can access only 
		//same method of subclass which is available in super class also
		//can not access s.Car();
		father s=new son();//create an object of sub class and provide reference of super class
		s.Money();   //150
		
		
		//downcasting
		son s1=(son)s; //typecasting downcasting object into sub class
		s1.Money();
		s1.car();
		
		//inheritance
		son s2 = new son();
		s2.Money();
		s2.car();
		
		
		
		
	}
	
}
