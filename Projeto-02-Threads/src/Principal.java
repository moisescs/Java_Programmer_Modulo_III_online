
public class Principal {

	public static void main(String[] args) {

		Thread t1 = new MinhaThread();
		Thread t2 = new MinhaThread();
		Thread t3 = new MinhaThread();
		Thread t4 = new MinhaThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
			
	}
		

}
