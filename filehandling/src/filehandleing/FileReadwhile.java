package filehandleing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s;
		Scanner sc = null;
		try {
			sc = new Scanner(new  FileInputStream("Dilip.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found");
			System.exit(0);
		}
		
		while(sc.hasNextLine()) {
			s = sc.nextLine();
			System.out.println(s);
			
		}


	}

}
