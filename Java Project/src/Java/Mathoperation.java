package Java;

public class Mathoperation {
	public static void main(String[] argvs)
	{
		System.out.println("Calling static method from same Class");
		addition();//calling static function in same class
        System.out.println("Calling non-static method from same Class");
        Mathoperation objsubtraction=new Mathoperation(); //creating object of class to call non-static function
        objsubtraction.subtraction(); //calling non-static function using object in same class
	}
	
	public static void addition()//declaring Static fuction
	{
		int a,b,ans;
		a=10;
		b=15;
		ans=a+b;
		System.out.println("Addition: "+a+"+"+b+ "="+ans);				
	}
	
	public void subtraction()//declaring Non-Static fuction
	{
		int a,b,ans;
		a=10;
		b=15;
		ans=b-a;
		System.out.println("Subtraction: "+b+"-"+a+ "="+ans);				
	}
}
