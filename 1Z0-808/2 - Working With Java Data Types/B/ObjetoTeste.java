/**
Duas referências são consideradas iguais somente se elas estão apontando para o mesmo objeto. 
Mesmo que os objetos que elas apontem sejam iguais, ainda são referências para objetos diferentes:
 */

class Objeto{
    int valor;
}

class ObjetoTeste{
    public static void main(String[]args){
        Objeto a = new Objeto();
        a.valor = 5;

        Objeto b = new Objeto();
        b.valor = 5;

        Objeto c = a;

        System.out.println(a == b); // false
        System.out.println(a == c); // true
    }
}