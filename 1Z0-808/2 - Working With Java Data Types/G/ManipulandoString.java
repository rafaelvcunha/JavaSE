class ManipulandoString{
    public static void main(String[]args){

        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");

        System.out.println(nomeDireto);
        System.out.println(nomeIndireto);

        char[] nome = new char[]{'J','A','V','A'};
        System.out.println(nome);

        String nula = null;
        System.out.println(nula);

        String s = " CaElUm ";
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.substring(2,4));
        System.out.println(s.substring(2));
        
        System.out.println(s.replace('a','i'));
        System.out.println(s.charAt(2));

        System.out.println(s.length());

        System.out.println("java".isEmpty());
        System.out.println("".isEmpty());

        String texto = "Certificado";
        System.out.println(texto.equals("Certificado"));
        System.out.println(texto.equals("certificado"));
        System.out.println(texto.equalsIgnoreCase("cErTiFiCaDo"));

        /**
        System.out.println(s.substring(-1));

        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
        at java.lang.String.substring(String.java:1927)
        at ManipulandoString.main(ManipulandoString.java:23)
         */

        /**
        System.out.println(s.charAt(20));
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
        at java.lang.String.charAt(String.java:658)
        at ManipulandoString.main(ManipulandoString.java:20)
         */

        /**
        System.out.println(s.length);

        ManipulandoString.java:28: error: cannot find symbol
        System.out.println(s.length);
                            ^
        symbol:   variable length
        location: variable s of type String
        1 error
         */
        
        /**
        System.out.println(s.size()); 
        
        ManipulandoString.java:39: error: cannot find symbol
        System.out.println(s.size());
                            ^
        symbol:   method size()
        location: variable s of type String
        1 error
         */

    }
}