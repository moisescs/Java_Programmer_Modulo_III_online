
public class MinhaThread extends Thread{
	
	public void run() {
		
		Thread estaThread = Thread.currentThread();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Estou na thread "+ estaThread.getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
