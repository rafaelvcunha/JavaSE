package maratonaJava.expressoesregulares;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");
		
		try {
			
			System.out.println("Arquivo criado? "+file.createNewFile());
			System.out.println("Permissão de Leitura? "+file.canRead());
			System.out.println("Permissão de Escrita? "+file.canWrite());
			System.out.println("Permissão de Execução? "+file.canExecute());
			System.out.println("Path: "+file.getPath());
			System.out.println("Path Absoluto: "+file.getAbsolutePath());
			System.out.println("Conteudo: "+file.toString());
			System.out.println("Length: "+file.length());
			System.out.println("Ultima modificação? "+new Date(file.lastModified()));
			
			if (file.exists()) {
				System.out.println("Deletado? "+file.delete());
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
