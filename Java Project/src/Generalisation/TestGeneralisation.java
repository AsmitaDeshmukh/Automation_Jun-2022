package Generalisation;

public class TestGeneralisation {
	public static void main(String[] args)
	{
		System.out.println("--------offers of Idea Simcard--------");
		Idea i = new Idea();
		i.audiocalling();
		i.sms();
		i.Internet();
		
		System.out.println();
		System.out.println("--------offers of Jio Simcard--------");
		Jio j = new Jio();
		j.audiocalling();
		j.sms();
		j.Internet();
		
		System.out.println();
		System.out.println("--------offers of Vodafone Simcard--------");
		Vodafone v = new Vodafone();
		v.audiocalling();
		v.sms();
		v.Internet();
	}
}
