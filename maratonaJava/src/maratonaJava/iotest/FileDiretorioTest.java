package maratonaJava.iotest;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

	public static void buscarArquivo(){
		File buscaArquivos = new File("/home/rafael/");
		String[] list = buscaArquivos.list();
		for (String arquivo : list) {
			System.out.println(arquivo);
		}
	}
	
	public static void main(String[] args) {
		
		File diretorio = new File("teste");
		diretorio.mkdir();
		
		File arquivo = new File(diretorio, "Arquivo.txt");
		
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File diretorioNovo = new File("teste2");
		diretorio.renameTo(diretorioNovo);
		
		File arquivoNovo = new File(diretorioNovo, "Arquivo2.txt");
		arquivo.renameTo(arquivoNovo);
		
		buscarArquivo();

	}

}
