import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {
	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new  BufferedReader(new FileReader("Poema.txt"));
			String linha;
			
						
			while(reader.ready()) {
				linha = reader.readLine();
				System.out.println(linha);
			}
			reader.close();
			
		} catch (IOException e) {
			System.out.println("Falha ao ler arquivo");
		}
		
	}
}
