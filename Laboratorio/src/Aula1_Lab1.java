import java.io.*;
public class Aula1_Lab1 {

	public static void main(String[] args) {
		
		escrever("Aula 1 \nLaboratório 1");
		ler();

	}
	
	static void escrever(String texto) {
		try {
			
			FileOutputStream file = new FileOutputStream("Aula_Lab1.txt");
			DataOutputStream dados = new DataOutputStream(file);
			dados.writeChars(texto);
			
		} catch (IOException e) {
			System.out.println("Não foi possivel escrever no arquivo.");
		}
	}
	
	static void ler() {
		
		try {
			FileInputStream file = new FileInputStream("Aula_Lab1.txt");
			DataInputStream dados = new DataInputStream(file);
			
			while (dados.available() > 0) {
				
				System.out.print(dados.readChar());
			}
			
		} catch (IOException e) {
			System.out.println("Não foi possivel ler o arquivo.");
		}
		
	}

}
