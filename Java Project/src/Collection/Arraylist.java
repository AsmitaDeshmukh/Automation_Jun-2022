package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Arraylist {
	public static void main(String[] args)
	{
		//1. Create Array
		ArrayList a1 = new ArrayList(); //ArrayList is build-in class
		ArrayList a2=new ArrayList();
		//2. Initialize array list
		a1.add("Asmita");
		a1.add('A');
		a1.add(500);
		a1.add(25.25f);
		a1.add(null);
		a1.add(true);
		a1.add(500);
		
	    System.out.println(a1);
		a1.remove(1);        //delete particular index from arraylist(left shift operation)
		System.out.println(a1);
		a1.add(2,'A');       //adding new value at index 2- inserting in between (right shift operation)
		System.out.println(a1);
		System.out.println(a1.get(1)); // to access second index value from array 500
		a1.set(4, "Replace");     /// to replace value
		System.out.println(a1);
		System.out.println(a1.size()); // it return size of array
		System.out.println(a1.isEmpty()); // check whether array is empty. (here it returns false)
		System.out.println(a1.contains(500)); //True it checks whether mentioned object(value) is available in array or not
		System.out.println(a1.contains(200)); //False
		
		System.out.println("-----------Print all the information in array list using Iterator--------------");
		Iterator i1 = a1.iterator();  //create object of array(copy of array
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		System.out.println("-----------Print all the information in array list using List Iterator--------------");
		
		ListIterator LI1 = a1.listIterator();
		
		while(LI1.hasNext())
		{
			System.out.println(LI1.next());
		}

		System.out.println("-----------Print all the information in array list using loop--------------");
		
		for(int i=0; i<=a1.size()-1; i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("-----------Print all the information in array list using for each------------");
		for(Object s1:a1)
		{
			System.out.println(s1);
		}
		
	}
}
