package maratonaJava.iotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	
	private static FileWriter fw;
	private static FileReader fr;
	private static BufferedWriter bw;
	private static BufferedReader br;
	private static String s = null;

	public static void main(String[] args) {


		File file = new File("Arquivo.txt");
		
		try {
			//escrita de arquivo
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("HEADER           0001           TESTE");
			bw.newLine();
			bw.write("DETALHE          0002           TESTE");
			bw.newLine();
			bw.write("TRAILLER         0003           TESTE");
			bw.newLine();
			bw.flush();
			bw.close();
			
			//Leitura de arquivo			
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			char[] field1 = new char[17];
			char[] field2 = new char[15];
			char[] field3 = new char[6];
			char[] field4 = new char[500];	
			
			br.read(field1, 0, 17);
			br.read(field2, 0, 15);
			br.read(field3, 0, 6);
			br.read(field4, 0, 500);
			
			System.out.println(field1);
			System.out.println(field2);
			System.out.print(field3);
			System.out.print(field4);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
