package maratonaJava.exerciciosVilt;

import java.util.ArrayList;

public class TextInput {
	
	ArrayList<String> c = new ArrayList<String>();
	
	public void add(char c){
		this.c.add(Character.toString(c));
	}
	
	public String getValue(){
		String out = "";
		for (String string : c) {
			out = out + string;
		}
		return out;
	}
}
