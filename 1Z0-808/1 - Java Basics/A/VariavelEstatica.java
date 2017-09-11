class VariavelEstaticaDTO{
    /**
    final static int id = 1;
    
    VariavelEstatica.java:29: error: cannot assign a value to final variable id
        VariavelEstaticaDTO.id = 2;
                           ^
    1 error
     */
    
    /**
    static int id = 2;

    VariavelEstatica.java:3: error: variable id is already defined in class VariavelEstaticaDTO
    static int id = 2;
               ^
    1 error
     */

    static int id = 1;
}

class VariavelEstatica{
    
    public static void main(String[]args){
    
        VariavelEstaticaDTO.id = 2;
    
        VariavelEstaticaDTO variavelEstaticaDTO = new VariavelEstaticaDTO();
        System.out.println(VariavelEstaticaDTO.id);// acessando direto pela classe
        System.out.println(variavelEstaticaDTO.id);// acessando pelo objeto
        
    }
}