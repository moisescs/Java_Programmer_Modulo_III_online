import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exemplo02Gravacao2 {

	public static void main(String[] args) {

		try {
			PrintWriter writer = new PrintWriter("frase-do-dia.txt");
			
			writer.println("�qua mole em pedra dura");
			writer.println("Tanto bate at� que fura.");
			
			writer.close();
			System.out.println("Gravado com sucesso!");
			
		} catch (FileNotFoundException e) {
			System.out.println("N�o foi possivel gravar o arquivo.");
		}
		
		
	}

}
