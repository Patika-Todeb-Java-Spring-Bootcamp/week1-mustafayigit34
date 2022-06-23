
public class ThreadProcess{
	
	public static void main(String[] args) {
		
		Thread c = new Thread(new Consumer());
		Thread p = new Thread(new Producer());
		
		p.start();
		c.start();
		
	}
}