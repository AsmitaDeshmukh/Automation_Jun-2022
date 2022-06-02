package Casting;

public class example {
    public static void main(String[] args)
    {
    	//1byte -> 2bytes -> 4bytes -> 8bytes
    	//byte -> short -> int -> long -> float -> double
    	
    	//implicite casting or widening casting (where memory goes on increasing)
    	int a = 5; //4bytes
    	double d = a; //implicit casting - 8bytes
    	System.out.println(d); // 5.0
    	
    	//explicite casting or narrowing casting (where memory goes on decreasing)
    	//double -> float -> long -> int -> short -> byte
    	double d1 = 5.0;         //8bytes
    	int a1 = (int)d1;            //implicit casting - 8bytes
    	System.out.println(a1);      // 5.0
    	
    	int a2=50;
    	float f=a2;
    	System.out.println(f);
    	
    	long i = 1234567890l;
    	System.out.println(String.valueOf(i)); //1234567890
    	
    }
}
