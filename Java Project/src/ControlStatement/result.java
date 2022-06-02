package ControlStatement;

public class result {
	public static void main(String[] argvs)
	{
		int percentage, rollno;
		String studname;
		rollno=1;
		studname = "ABC";
	    percentage=60;
	    
	    if(percentage>=50)
	    {
	    	System.out.println(rollno + " - "+ studname + " - pass with " +percentage + " marks");
	    }
	    else
	    {
	    	System.out.println(rollno + " - "+ studname + " - fail with " +percentage + " marks");
	    }
	}    

}
