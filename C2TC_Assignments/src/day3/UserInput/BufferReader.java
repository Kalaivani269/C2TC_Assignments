package day3.UserInput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReader {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name:");
		String name= br.readLine();
		
		System.out.println("Enter your id:");
		int id= Integer.parseInt(br.readLine());
		
		System.out.println("Enter the marks:");
		float marks=Float.parseFloat(br.readLine());
		
		System.out.println("name:"+ name+"Id:"+id+"Mark:"+marks);
		
		
		
	}
	

}
