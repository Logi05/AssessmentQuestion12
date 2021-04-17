package com.question12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHand1 {
	public static void main(String[] args) {
		File f=new File("Logi.txt");
		try {
			boolean value=f.createNewFile();
			if(value) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			FileWriter f1=new FileWriter("Logi.txt");
			f1.write("Hellow Everyone");
			f1.close();
			System.out.println("File written Successfully");
			}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			File obj=new File("Logi.txt");
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine()) {
				String d=sc.nextLine();
				System.out.println(d);
				System.out.println("Successfully Readed Successfully");
			}
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		File obj1=new File("Abc.txt");
		if(obj1.delete()) {
			System.out.println("File Deleted Successfully");
		}
		else {
			System.out.println("Error");
		}
		}	
	}

