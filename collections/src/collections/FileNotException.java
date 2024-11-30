package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file = new File( " ");
			FileReader fr = new FileReader(file);
			System.out.println("File exist");
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found");
		}

	}

}
