class Calculadora{

    /**
    
    public int soma(int[] nums){
        int total = 0;

        for( int a : nums){
            total += a;
        }

        return total;
    }



    CalculadoraTeste.java:20: error: method soma in class Calculadora cannot be applied to given types;
    System.out.println(c.soma());
                        ^
    required: int[]
    found: no arguments
    reason: actual and formal argument lists differ in length
    CalculadoraTeste.java:21: error: incompatible types: int cannot be converted to int[]
        System.out.println(c.soma(1));
                                ^
    CalculadoraTeste.java:22: error: method soma in class Calculadora cannot be applied to given types;
        System.out.println(c.soma(1,2));
                            ^
    required: int[]
    found: int,int
    reason: actual and formal argument lists differ in length
    
     */

    public int soma(int... nums){
        int total = 0;

        for( int a : nums){
            total += a;
        }

        return total;
    }

}

class CalculadoraTeste{
    public static void main(String []args){

    Calculadora c = new Calculadora();

    System.out.println(c.soma());
    System.out.println(c.soma(1));
    System.out.println(c.soma(1,2));
    System.out.println(c.soma(1,2,3));
    System.out.println(c.soma(1,2,3,4,5,6,7,8)); 
    System.out.println(c.soma(new int[]{ 1, 2, 3, 4 }));   

    }
}