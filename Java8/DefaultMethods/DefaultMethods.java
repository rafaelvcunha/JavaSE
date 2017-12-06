//

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class DefaultMethods{
	public static void main(String[] args){
		
		List<String> palavras  = new ArrayList<>();
		
		palavras.add("Testando o Default Method");
		palavras.add("ForEach da Interface String");
		palavras.add("Muito Show!!!");
		
		//for(String p : palavras){
		//	System.out.println(p);
		//}
		
		Consumer<String> consumidor = new ConsumidorDeString();
		
		//palavras.sort();
		
		palavras.forEach(consumidor);
	}
}

class ConsumidorDeString implements Consumer<String>{
	public void accept(String s){
		System.out.println(s);
	}
}