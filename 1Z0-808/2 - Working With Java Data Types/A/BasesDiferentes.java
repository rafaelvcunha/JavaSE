class BasesDiferentes{
    public static void main(String[]args){
        int o = 0761;// base octal
        int h = 0xAB3400; // base hexadecimal
        int b = 0b100001011; // base binária
        /**
        int e = 0769;// base octal
        BasesDiferentes.java:4: error: integer number too large: 0769
        int e = 0769;// base octal
                ^
        1 error
         */
        double d = 3.1E3;
        float f = 2e3f;
        char lf = 10;  
        char c = 65;
        char sete = 7;
        char a = 33;
        char delete = 127;
        char unicode = '\u03A9'; // unicode
          
        
        System.out.println(o);
        System.out.println(h);
        System.out.println(b);
        //System.out.println(e);
        System.out.println(d);
        System.out.println(f);
        System.out.println(lf);
        System.out.println(c);
        System.out.println(sete);
        System.out.println(a);
        System.out.println(delete);
        System.out.println(lf);
        System.out.println(unicode); // imprime a letra grega ômega
    }
}