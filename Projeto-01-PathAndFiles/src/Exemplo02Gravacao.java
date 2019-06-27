import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exemplo02Gravacao {

	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("Poema.txt", true);
			writer.write("Java é divertido");
			writer.close();
			
		} catch (IOException e) {
			System.out.println("Arquivo não existe");
			e.printStackTrace();
		}		

	}

}
