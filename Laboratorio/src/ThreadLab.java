
public class ThreadLab extends Thread {

	
	public ThreadLab(String s) {
		super(s);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName());
			metodoAuxiliar();
		}
		
		try {
			sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Erro!");
		}
	}
	
    private synchronized void metodoAuxiliar() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Auxiliar " + Thread.currentThread().getName());
		}
	}
}
