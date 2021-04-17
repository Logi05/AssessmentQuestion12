package com.question12;

public class Finally7 {
	public static void main(String[] args) {
		try
		{
			int i=20,j=0;
			int a=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("This is finally Block");
		}
	}
}
