package PromedioGrupo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promediogrupo {
    public static void main(String[] args) throws IOException {
        int size; //Tamaño del grupo
        double[] grade; //Arreglo calificaciones
        double suma = 0; //para sumar calificaciones
        double promedio; //Promedio del grupo
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // Recuperando el tamaño del arreglo
        System.out.println("Bienvenido a su sistema de cálculo de promedio grupal:");
        System.out.println("¿Cuantos alumnos son en el salón?: ");
        entrada = bufer.readLine();//Lectura del teclado
        size = Integer.parseInt(entrada); //Conversión de String a Int

        //Construimos el arreglo
        grade= new double[size];

        //Rellenar el arreglo mediante teclado
        for ( int s = 0; s < grade.length; s++ ){
            System.out.println("Escribe la calificación del alumno " + (s+1) + ": ");
            entrada = bufer.readLine(); //Leer el valor
            grade[s]  = Double.parseDouble(entrada); //Almacenar en el arreglo
            suma += grade[s]; //Suma calificaciones a la variable suma
        }

        //Calculo de promedio de calificaciones
        promedio = suma / size;

        //Imprimir el contenido del arreglo usando un for extendido
        System.out.println("Las calificaciones de los alumnos son:");
        for ( double calif : grade )
        System.out.println("Calificación del alumno: " + calif); //Tecla sout para crear la línea de código

        //Imprimir el promedio del grupo
        System.out.println("El promedio del grupo es: " + promedio);
    }
}
