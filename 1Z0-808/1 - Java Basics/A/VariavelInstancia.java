class VariavelInstancia{
    // variável de instância ou variável de objeto
    String nome;

    public void setNome(String n) {
        // acessando a variável de instância no método
        this.nome = n;
    }

    public void imprimir(){
        System.out.println(this.nome);
    }

    public static void main(String [] args){

        VariavelInstancia teste = new VariavelInstancia();

        teste.setNome("Rafael");
        teste.imprimir();
    }
}