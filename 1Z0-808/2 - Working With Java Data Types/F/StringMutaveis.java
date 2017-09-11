class StringMutaveis{
    public static void main(String[]args){

        StringBuffer sb = new StringBuffer();
        sb.append("Caelum");
        sb.append(" - ");
        sb.append("Ensino e Inovação");

        System.out.println(sb);

        StringBuffer sb5 = new StringBuffer();
        sb5.append("Caelum - Inovação");
        sb5.insert(9, "Ensino e ");
        System.out.println(sb5);

        sb5.delete(6, 15);
        System.out.println(sb5);

        sb5.reverse();
        System.out.println(sb5);

        System.out.println(sb5.charAt(2));

        System.out.println(sb5.length());

        System.out.println(sb.equals(sb5));

        StringBuffer sb6 = sb;
        System.out.println(sb.equals(sb6));

        System.out.println(sb5.indexOf(" e "));

        System.out.println(sb5.lastIndexOf(" e "));

        System.out.println(sb5.substring(5) );        

        System.out.println(sb5.substring(5, 7) );     

        //Vazio
        StringBuilder sb1 = new StringBuilder();
        //Conteudo Inicial
        StringBuilder sb2 = new StringBuilder("JAVA");
        //Tamanho Inicial do array para colocar a String
        StringBuilder sb3 = new StringBuilder(50);
        //Baseado em outro objeto do mesmo tipo
        StringBuilder sb4 = new StringBuilder(sb2);
    
        System.out.println(sb1+ " " + sb1.length());
        System.out.println(sb2+ " " + sb2.length());
        System.out.println(sb3+ " " + sb3.length());
        System.out.println(sb4+ " " + sb4.length());


    }
}