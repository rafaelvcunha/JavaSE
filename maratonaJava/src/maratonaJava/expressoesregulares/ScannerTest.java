package maratonaJava.expressoesregulares;

import java.util.Scanner;

public class ScannerTest {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner("Vinicius, Rafael, Diogo, Luis, Marcelo, Lucas, Rodrigo");
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			System.out.println(scanner.next().trim());
		}

	}

}
