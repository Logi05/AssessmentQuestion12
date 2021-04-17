package com.question12;

import java.util.Scanner;

public class SumOfDigit3 {
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,x;
		while(n>0)
		{
			x=n%10;
			sum +=x;
			n=n/10;
		}
		System.out.println("Sum of digits:"+sum);
	}
}
