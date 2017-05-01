package maratonaJava.exerciciosVilt;

public class NumericInput extends TextInput{
	
	@Override
	public void add(char c){
		if(Character.isDigit(c) == true)
		this.c.add(Character.toString(c));
	}
	
	@Override
	public String getValue(){
		String out = "";
		for (String string : c) {
			out = out + string;
		}
		return out;
	}
}
