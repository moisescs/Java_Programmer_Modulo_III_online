
public class Aula3_Lab1 {

	public static void main(String[] args) {

		Thread t1 = new ThreadLab("Thread 01");
		Thread t2 =  new ThreadLab("Thread 02");
		
		t1.start();
		t2.start();		
		
	}

}
