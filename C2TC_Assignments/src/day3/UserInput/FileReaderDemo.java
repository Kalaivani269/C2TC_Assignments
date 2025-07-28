package day3.UserInput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		
		// used to load the resource link to the class loader
		URL resource=FileReaderDemo.class.getResource("MVIT_TNS.txt");
		
		if(resource==null) {
			System.err.println("File not found");
		}
		//converting URL into file object
		File f=new File(resource.getFile());
		
		//object creation of the file reader
		FileReader fr=new FileReader(f);
		
		//object creation for buffer reader class
		BufferedReader br= new BufferedReader(fr);
		
		String line =br.readLine();
	}

}
