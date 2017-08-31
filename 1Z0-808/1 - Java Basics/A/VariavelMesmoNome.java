class VariavelMesmoNomeDTO{
    /**
    int a = 0;    
    int a = 10;
    VariavelMesmoNome.java:3: error: variable a is already defined in class VariavelMesmoNomeDTO
    int a = 10;
        ^
    1 error    
     */

    /**
    static int a;
    int a; 
    VariavelMesmoNome.java:12: error: variable a is already defined in class VariavelMesmoNomeDTO
    int a;
        ^
    1 error
     */

    /**
    public void metodo(String par) {
    int par = 0; // erro de compilação

    System.out.println(par); // qual?
    }
    */

    /**
    static int a;
    int a; 

    System.out.println(a);

    VariavelMesmoNome.java:34: error: <identifier> expected
    System.out.println(a);
                      ^
    VariavelMesmoNome.java:34: error: <identifier> expected
        System.out.println(a);
                            ^
    2 errors
     */

    int a = 10;

    public void metodo() {
        int a = 20; // shadowing
        System.out.println(a); // imprime 20
    }
}

class VariavelMesmoNome{

    public static void main(String []args){

        VariavelMesmoNomeDTO variavelMesmoNomeDTO = new VariavelMesmoNomeDTO();

        variavelMesmoNomeDTO.metodo();

    }
    
} 