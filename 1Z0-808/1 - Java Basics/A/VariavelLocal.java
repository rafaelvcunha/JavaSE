class VariavelLocal {
    
    
    public void m1() { // início do bloco do método
        int x = 10; // variável local do método

        if (x >= 10) { // início do bloco do if
            int y = 50; // variável local do if
            //System.out.println(y);

        } // fim do bloco do if

        System.out.println(y);

        /**
        Teste.java:13: error: cannot find symbol
        System.out.println(y);
                                ^
        symbol:   variable y
        location: class Teste
        1 error
        */

    } // fim do bloco do método

    public void m2(String bla) {
            System.out.println(bla);
        }

    public void m3() {
        // erro de compilação pois bla não existe neste
        // escopo
        System.out.println(bla);
        //m2("TESTE");
    }
    /**
    Teste.java:33: error: cannot find symbol
        System.out.println(bla);
                           ^
    symbol:   variable bla
    location: class Teste
    1 error
     */


    public static void main(String[] args){

        VariavelLocal teste = new VariavelLocal();

        teste.m1();
        teste.m3();
        
    }

}