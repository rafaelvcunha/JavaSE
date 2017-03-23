package maratonaJava.iotest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {

	private static FileWriter fw;
	private static FileReader fr;

	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");
		
		try {
			//escrita de arquivo
			fw = new FileWriter(file);
			fw.write("HEADER           0001           TESTE\n");
			fw.write("DETALHE          0002           TESTE\n");
			fw.write("TRAILLER         0003           TESTE\n");
			fw.flush();
			fw.close();
			
			//Leitura de arquivo			
			fr = new FileReader(file);
			char[] field1 = new char[17];
			char[] field2 = new char[15];
			char[] field3 = new char[6];
			char[] field4 = new char[500];
			
			fr.read(field1, 0, 17);
			fr.read(field2, 0, 15);
			fr.read(field3, 0, 6);
			fr.read(field4, 0, 500);
			
			System.out.println(field1);
			System.out.println(field2);
			System.out.print(field3);
			System.out.print(field4);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
