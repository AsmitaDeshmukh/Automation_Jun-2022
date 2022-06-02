package ControlStatement;

public class forloop {
	public static void main(String[] argvs)
	{
		int i=1;
		int ans=0;
		for(i=1;i<=10;i++)
		{
			ans=ans+i;
		}
		System.out.println("Addition of 1 to 10 no is "+ans);
		

		System.out.println("Reverse even no from 1 to 10 no is ");
		for(i=10;i>=1;i=i-2)
		{
			System.out.println(i);
		}
		
	}
}
