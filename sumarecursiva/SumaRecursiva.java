public class sumaRecursiva {
    public static int suma(int number){
        System.out.println("La suma, con num = " + number);
        // caso base
        if( number == 1 ){
             System.out.println("La suma en el caso base, number = " + number);
             return 1;
        }else{
            System.out.println("Invocando suma recursiva con number = " + (number-1));
            return number + suma( number - 1 );
        }
    }
    public static void main(String[] args){
        int numero = 6;
        int sum;

        System.out.println("Suma Recursiva de un número");
        sum = suma( numero );
        System.out.println("La suma de " +  numero + " es: " +  sum);

    }
}
