import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Aula1_Lab2 {
	
	static String PASTA_ORIGEM = "C:\\Users\\MoisesCarneiroDaSilv\\Box\\Curso_Java\\Java_Programmer_Modulo_III_online\\Origem\\";
	static String PASTA_BACKUP = "C:\\Users\\MoisesCarneiroDaSilv\\Box\\Curso_Java\\Java_Programmer_Modulo_III_online\\BKP\\";
	

	public static void main(String[] args) {
		

		try {
			Path origem = Paths.get(PASTA_ORIGEM);
			Path backup = Paths.get(PASTA_BACKUP);
						
			if (!Files.exists(backup)){
				
				Files.createDirectories(backup);
				System.out.println("Criando diretoio de backup.");
			}
			
			Stream<Path> streamOrigem = Files.list(origem);
			
			streamOrigem.forEach(p -> {
				try {
					System.out.println("Copinado o arquivo "+p.getFileName());
					Files.copy(p, backup.resolve(p.getFileName()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
