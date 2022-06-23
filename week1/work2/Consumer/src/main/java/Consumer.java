import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consumer implements Runnable{
	
	public synchronized void run() {
	    try {
	        File file = new File("../src/resources/score.txt");
	        Scanner reader = new Scanner(file);
	        System.out.flush();
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
