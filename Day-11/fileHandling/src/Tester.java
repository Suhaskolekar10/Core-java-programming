import java.io.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args){
		File file=new File("/home/dai/Desktop/Java_Basics/Day-11.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File created...");
		
		
		
//Write into the file
		try {
			FileWriter filewriter=new FileWriter(file);
			filewriter.write("This is first line into the file..");
			filewriter.close();	
		} catch (Exception e) 
		{
		}

		
//read from the file:-
//		
//		FileReader filereader;
//		try {
//			char [] s=new char [100];
//			filereader = new FileReader(file);
//			filereader.read(s);
//			System.out.println(s);
//		} catch (Exception e) {
//		}
//		
////read the file using  scanner:-		
//		try {
//			Scanner sc=new Scanner(file);
//			while(sc.hasNextLine())
//			{
//				
//				String str=sc.nextLine();
//				
//				System.out.println(str);
//			}
//		} catch (FileNotFoundException e) {
//		}
//		
//		
	}

}
