package com.question12;

public class FinallyEg8 {
	public static void main(String[] args) {
		try
		{
			int i=20,j=0;
			int a=i/j;
		}		
		finally {
			System.out.println("This is finally Block");
		}
	}
}
