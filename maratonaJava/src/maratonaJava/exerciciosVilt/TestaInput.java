package maratonaJava.exerciciosVilt;

public class TestaInput {

	public static void main(String[] args) {

		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());

	}

}
