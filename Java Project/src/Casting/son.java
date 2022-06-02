package Casting;

//
public class son extends father 
{
     public void Money()
     {
    	 System.out.println("Money:150"); //method overriding
     }
     
     public void car() 
     {
    	 //not eligible for upcasting
    	 System.out.println("Son : Car");
     }
     
}
