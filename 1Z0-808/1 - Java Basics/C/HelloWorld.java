public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello " + args[0] + " " + args[1]);

        /**
        Caso não tenha parametros infomados na execução.
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
        at HelloWorld.main(HelloWorld.java:3)
         */
    }
}