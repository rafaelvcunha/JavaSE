package maratonaJava.exerciciosVilt;

public class Exercicio2 {
	
	/*public static int instanceCount = 0;
	public static void GetIntanceCount(){ return instanceCount;}

	public final String name;
	public void GetName() { return name;}
	
	public Exercicio2(String name){
		instanceCount++;
		name = name;
	}
	
	public static void main(String[] args) {
		
		Exercicio2 x = new Exercicio2("X");
		Exercicio2 y = new Exercicio2("Y");
		Exercicio2 z = new Exercicio2("Z");
		
		println(x.getName() + " : " + x.getIntanceCount());
		println(y.getName() + " : " + y.getIntanceCount());
		println(z.getName() + " : " + z.getIntanceCount());
		
		x.name = "zzz";
		println(x.getName() + " : " + x.getIntanceCount());		
		
	}*/
}	
	/* 
	O código não compila, pois há alguns erros.
	
	O método GetIntanceCount() é do tipo void, mas deveria ser declado como int
	O método GetName() é do tipo void, mas deveria ser declado como String
	Por convenção métodos devem iniciar com letra minuscula.
	Dentro do construtor deve ser declarado "this.name = name;" para informar que a variavel global name recebe a variavel local name.
	Para imprimir dados no console, deve-se usar "System.out.println" ao invés de "println"
	Os métodos static devem se chamados sem uma instância, dessa forma deve-se utilizar "MyClass.getIntanceCount()"
	A variável name foi declarada como final e é imutavel, dessa forma "x.name = "zzz";" não compila.
	
	*/


