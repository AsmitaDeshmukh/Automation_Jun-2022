package ControlStatement;

public class loginscreen {
	public static void main(String[] argvs)
	{
		String username;
		String password;
		username="Admin";
		password="administrator";
		if(username=="Admin" && password=="administrator")
		{
			System.out.println("Login Successfully");
		}
		else
		{
			if(username=="Admin")
			{
				System.out.println("username is right");
			}
			else
			{
				System.out.println("username is wrong");
			}
			if(password=="administrator")
			{
				System.out.println("password is right");
			}
			else
			{
				System.out.println("password is wrong");
				
			}
		}
	}
}
