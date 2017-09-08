//Quando a variável é membro de uma classe, ela é iniciada implicitamente junto com o objeto com um valor default

class Prova{
    String nome;
    char sexo;
    int tempo;
    double nota;
    boolean resultado;
    int[] numeros = new int[10];
    
    
}

class ProvaTeste{
    public static void main(String[]args){

        Prova prova = new Prova();

        System.out.println(prova.nome);
        System.out.println(prova.sexo);
        System.out.println(prova.tempo);
        System.out.println(prova.nota);
        System.out.println(prova.resultado);
        System.out.println(prova.numeros[0]);
        
    }
}