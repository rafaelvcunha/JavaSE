class Pessoa{
    String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}

class TestePessoa{
    public static void main(String[]args){

        Pessoa p = new Pessoa();

        //chamando método na variável de ref.
        p.setNome("Mario");

        //Atribuindo o retorno do método a variável.
        String nome = p.getNome();

        System.out.println(p.nome);
        System.out.println(nome);

        
        /**
        // erro, método é void
        String a = p.setNome("X");
        TestePessoa.java:29: error: incompatible types: void cannot be converted to String
        String a = p.setNome("X");
                            ^
        1 error
         */
        
    }
}