package Java;

public class CallMethod {
	public static void main(String[] argvs)
	{
		System.out.println("Calling static method from Mathoperation Class");
		Mathoperation.addition(); //calling static method from other class
		System.out.println("Calling non-static method from Mathoperation Class");
		Mathoperation objsubtraction=new Mathoperation(); // creating object of Mathoperation class 
		objsubtraction.subtraction(); //calling non-static method from other class
	}
}
