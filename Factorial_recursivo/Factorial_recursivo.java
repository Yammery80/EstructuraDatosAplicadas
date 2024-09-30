public class Factorial_recursivo{

    public static int factorial(int num){
        System.out.println("En factorial, con num = " + num);
        // caso base
        if( num == 0 ){
             System.out.println("En factorialen el caso base, num = " + num);
             return 1;
        }else{
            System.out.println("Invocando factorial con num = " + (num-1));
            return num * factorial( num - 1 );
        }
    }
    public static void main(String[] args){
        int numero = 5;
        int fact;

        System.out.println("Factorial Recursivo de un número");
        fact = factorial( numero );
        System.out.println("El factorial de " +  numero + " es: " +  fact);

    }
}