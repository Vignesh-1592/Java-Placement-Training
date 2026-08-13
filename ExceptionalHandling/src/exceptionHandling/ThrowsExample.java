package exceptionHandling;

// For checked Exception we should mention throws in method signature

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
 class DataSource{
	 void readFile() throws IOException { //--> check Exception <--//
		 File f = new File("D://Sample.txt");
		 FileReader fr = new FileReader(f);
		 fr.read();
		 fr.close();
	 }
 }
public class ThrowsExample {

//	public static void main(String[] args) throws IOException { // If you add throws in main function it is the bad programming style 
		
	public static void main(String[] args) throws IOException {
//  	try {
//			DataSource obj = new DataSource();
//			obj.readFile();
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Rest of the code");
		
		DataSource obj = new DataSource();
		try {
			
			obj.readFile();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}
}
