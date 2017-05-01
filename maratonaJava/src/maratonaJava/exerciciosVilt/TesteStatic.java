package maratonaJava.exerciciosVilt;

public class TesteStatic {
	
	    private static int instancia = 0;
	    public static int getInstanciaCount() {

	        return instancia;
	    }
	    
	    public final String nome;
	    
	    public String getNome(){
	    	return nome;
	    }
	
		public TesteStatic(String nome){
			instancia++;
			this.nome = nome;
		}	    
	    
	public static void main(String[] args) {
		
		TesteStatic x = new TesteStatic("X");
		TesteStatic y = new TesteStatic("Y");
		
		System.out.println(x.getNome() + " : " + TesteStatic.getInstanciaCount());
		System.out.println(y.getNome() + " : " + TesteStatic.getInstanciaCount());
		
		//x.nome = "zzz";
		System.out.println(x.getNome() + " : " + TesteStatic.getInstanciaCount());
		/* 
		O código não compila, pois há alguns erros.
		
		O método GetIntanceCount() é do tipo void, mas deveria ser declado como int
		O método GetName() é do tipo void, mas deveria ser declado como String
		Por convenção métodos devem iniciar com letra minuscula.
		Dentro do construtor deve ser declarado "this.name = name;" para informar que a variavel global name recebe a variavel local name.
		Para imprimir dados no console, deve-se usar "System.out.println" ao invés de "println"
		Os métodos static devem se chamados sem uma instância, dessa forma deve-se utilizar "MyClass.getIntanceCount()"
		A variável name foi declarada como final e é imutavel, dessa forma "x.name = "zzz";" não compila.

The code doesn´t compile because there are some errors.

+ The method GetIntanceCount () is of the type void, but should be declared as int
+ The method GetName () is of the type void, but should be declared as String.
+ By convention methods should starts with lowercase.
+ Inside the constructor, should be declared "this.name = name;" to inform that the global variable name receives the local variable name.
+ To print data to the console, you must use "System.out.println" instead of "println".
+ Static methods should be called without an instance, so you should use "MyClass.getIntanceCount ()" .
+ The variable name was declared final and is immutable, thus x.name =" zzz "; doesn't compile.
		*/
		
	}

}
