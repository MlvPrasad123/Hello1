package com.five;

//import javax.management.RuntimeErrorException;

public class Prasad
{
	public static void main(String[] args) 
	{
		int a=1;
		int k=0;
		try {
			
			throw new RuntimeException("Adsasd");
			
			
		} catch (ArithmeticException e) {
			System.out.println("murthy");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("prasad");
			e.printStackTrace();

	}
}
	
	
	}