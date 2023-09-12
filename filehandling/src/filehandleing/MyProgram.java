package filehandleing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter(new FileOutputStream("Dilip.txt"));
		String s;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me yout new name");
		s = kb.nextLine();
		pw.println(s);
		pw.close();

	}

}
