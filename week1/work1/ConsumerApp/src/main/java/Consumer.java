import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consumer {
	public static void main(String[] args) {
		
	    try {
	        File file = new File("../src/resources/score.txt");
	        Scanner reader = new Scanner(file);
	        while (reader.hasNextLine()) {
	          String data = reader.nextLine();
	          System.out.println(data);
	        }
	        reader.close();
	        
	      } catch (FileNotFoundException e) {
	        System.out.println("Dosya bulunamadý.");
	        e.printStackTrace();
	      }
	    
	}
	
}
