package maratonaJava.expressoesregulares;

public class TokenTest {

	public static void main(String[] args) {
		
		String str = "Vinicius, Rafael, Diogo, Luis, Marcelo, Lucas, Rodrigo";
		String[] token = str.split(",");
		
		for (String campo : token) {
			System.out.println(campo.trim());
		}

	}

}
