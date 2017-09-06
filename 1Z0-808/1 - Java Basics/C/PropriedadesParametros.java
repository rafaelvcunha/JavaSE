import java.util.Properties;

class PropriedadesParametros{
    public static void main(String[] args){
        Properties propriedade  =  System.getProperties();
        propriedade.list(System.out);
        System.out.println("Parametro "+args[0]);
        /**
        java -Ddesenvolvedor=RafaelVieiraDaCunha PropriedadesParametros Adicionado
         */
    }
}