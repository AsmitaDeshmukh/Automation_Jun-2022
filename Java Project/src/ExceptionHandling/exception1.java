package ExceptionHandling;

public class exception1 {
	
	public static void main(String[] args)
	{
		
		try
		{
			int a[]= new int[2];
			a[0]=1;  //risky code
			a[1]=2;
			a[2]=3;
			
		}catch(ArrayIndexOutOfBoundsException e)  //in this if error in array then it will handel this exception
		{
			System.out.println("Arithmatic Exception found");
				
		try
		{
			int a[]= new int[2];
			int i;
			a[0]=1;  //risky code
			a[1]=2;
			i=a[0]/0;
			System.out.println(i);
		}catch(Exception a)     //in this if error in arithmatic operation then it will handel this exception
		{
			System.out.println("Exception Found");
		}
		finally
		{
			System.out.println("finally block always get executed");
		}
		
	}

}
}
