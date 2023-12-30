// Q.1:- Write a java code to copy "src.txt"file into another "dest.txt".

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Que_1 {

	public static void main(String[] args) {
		char [] s=new char [100];
//Reading the source file		
		try {
			FileReader file=new FileReader("/home/dai/Desktop/Java_Basics/src.txt");
			file.read(s);
		} catch (Exception e) {
		}
		File file2=new File("/home/dai/Desktop/Java_Basics/dest.txt");
		try
		{
		FileWriter filewrite=new FileWriter(file2);
		filewrite.write(s);
		filewrite.close();	
		System.out.println(s);
		}
		catch(Exception e) {}
	}

}
