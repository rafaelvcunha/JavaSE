package maratonaJava.exerciciosVilt;

public class Exercicio1 {
	

	public static void main(String[] args) {
		
		System.out.println("Printing Numbers In Ascending Order\n");		
				
		for (int i = 1; i <= 200; i++) {
			if(i%3 == 0 & i%5 == 0)
			  	System.out.println("M35");			
			else if(i%3 == 0)
				System.out.println("M3");
			else if(i%5 == 0)
				System.out.println("M5");
			else
				System.out.println(i);
		}
		
		System.out.println("\n\nPrinting Numbers In Descending Order\n");
		
		for (int i = 200; i >= 1; i--) {
			if(i%3 == 0 & i%5 == 0)
			  	System.out.println("M35");			
			else if(i%3 == 0)
				System.out.println("M3");
			else if(i%5 == 0)
				System.out.println("M5");
			else
				System.out.println(i);
		}

		
		
	
	}

}
