package filehandleing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		PrintWriter pw = null;
		String s;
		Scanner kb = new Scanner(System.in);
		try {
			pw = new PrintWriter(new FileOutputStream("Dilip.txt", true) );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found");
		}
		
		System.out.println("Please give me yout new name");
		s = kb.nextLine();
		pw.println("Your name is " + s);
		pw.close();
		System.out.println("File created thank you.");

	}

}
