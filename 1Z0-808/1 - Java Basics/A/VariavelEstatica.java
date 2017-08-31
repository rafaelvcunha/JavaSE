class VariavelEstaticaDTO{
    static int id = 1;
    /**
    static int id = 2;

    VariavelEstatica.java:3: error: variable id is already defined in class VariavelEstaticaDTO
    static int id = 2;
               ^
    1 error
     */
}

class VariavelEstatica{
    
    public static void main(String[]args){
    
        VariavelEstaticaDTO.id = 2;

        VariavelEstaticaDTO variavelEstaticaDTO = new VariavelEstaticaDTO();
        System.out.println(VariavelEstaticaDTO.id);// acessando direto pela classe
        System.out.println(variavelEstaticaDTO.id);// acessando pelo objeto
    
    }
}