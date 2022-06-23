import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Producer {

	public static void main(String[] args) {

		System.out.println("\"Takým1 Skor1-Skor2 Takým2\":");
		Scanner scan = new Scanner(System.in);
		String score = scan.nextLine();
		
		try {
		      FileWriter writer = new FileWriter("../src/resources/score.txt",true);
		      writer.write(score+"\n");
		      writer.close();
		      System.out.println("Yazdýrma iþlemi baþarýlý!");
		    } catch (IOException e) {
		      System.out.println("Yazdýrma iþlemi baþarýsýz!");
		      e.printStackTrace();
		    }
		
	}

}
