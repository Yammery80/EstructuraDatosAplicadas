import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class arreglos { //Tiene que tener el mismo nombre del archivo en una misma linea

    public static void main(String[] args) throws IOException { //Tecla psvm para crear la linea de código
        //Declaración y construcción de un arreglo en la misma linea
        int[] arreglo1 = new int [5];

        //Asignación de valores al arreglo
        for (int i = 0; i < arreglo1.length; i++) //arreglo1.lenght-1 => se puede usar tambien
        arreglo1[i] = i+1;

        //Imprimir el contenido del arreglo usando un for extendido
        System.out.println("Los elementos del arreglo son :");
        for ( int elemento : arreglo1 )
        System.out.println("Elemento: " + elemento); //Tecla sout para crear la línea de código

 //******************************************************************
    //Declaración de un arreglo declaración y construccion del arrgloe por separado
        double[] arreglo2;
        //No se puede usar un arreglo que no ha sido contruido
        //arreglo2[0] =12.2;

        //Para ingresar datos
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        //Tamaño del arreglo
        int t;
        System.out.println("¿Cual es el tamaño de arreglo?:");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        //Construimos el arreglo
        arreglo2= new double[t];

        //Rellenar el arreglo mediante teclado
        for ( int i = 0; i < arreglo2.length; i++ ){
            System.out.println("Escribe elemento [" + (i+1) + "]: ");
            entrada = bufer.readLine();
            arreglo2[i]  = Double.parseDouble(entrada);
        }

        //Imprimir el contenido del arreglo usando un for extendido
        System.out.println("Los elementos del arreglo son :");
        for ( double elemento2 : arreglo2 )
        System.out.println("Elemento: " + elemento2); //Tecla sout para crear la línea de código
}
}
