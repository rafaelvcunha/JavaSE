package maratonaJava.expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		
		String regex = "\\s";
		String texto = "hdis_ lps415641adjjidf";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto:  "+texto);
		System.out.println("indice: 0123456789");
		System.out.println("Expressão procurada: "+matcher.pattern());
		
		System.out.print("Posições encontradas: ");
		while(matcher.find()){
			System.out.print(matcher.start() + " ");
		}
		
	}

}
