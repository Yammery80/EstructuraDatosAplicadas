package PromedioGrupo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promediogrupo {
    //Declarando variables globales
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

    public static String entrada;
    //Declaración de un arreglo de tipo TDA
    public static Alumno[] alumnos;

    public static void leerAlumnos() throws IOException{
        String matricula, nombre;
        System.out.println("Solicitud de información de cada estudiante");
        for ( int i = 0; i < alumnos.length; i++ ){
            System.out.println("---------------------------");
            System.out.println("Escribe la matrícula: ");
            matricula = bufer.readLine();
            System.out.println("Escribe el nombre: ");
            nombre = bufer.readLine();

            //Creación de un objeto (POJO)
            Alumno a = new Alumno(matricula, nombre);

            System.out.println("Escribe calificación de estructura: ");
            entrada = bufer.readLine();
            a.setStructures(Double.parseDouble(entrada));

            System.out.println("Escribe calificación de inglés: ");
            entrada = bufer.readLine();
            a.setEnglish(Double.parseDouble(entrada));

            System.out.println("Escribe calificación de IoT: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));
            a.setAverage();

            // Agregando un alumno al arreglo
            alumnos[i] = a;

        }
    }
    
    public static void main(String[] args) throws IOException {
        int size; //Tamaño del grupo

        //double[] grade; //Arreglo calificaciones
        //double suma = 0; //para sumar calificaciones
        //double promedio; //Promedio del grupo
        


        // Recuperando el tamaño del arreglo
        System.out.println("Bienvenido a su sistema de cálculo de promedio grupal:");
        System.out.println("¿Cuantos alumnos son en el salón?: ");
        entrada = bufer.readLine();//Lectura del teclado
        size = Integer.parseInt(entrada); //Conversión de String a Int

        //Construir arreglo alumnos
        alumnos = new Alumno[size];

        // //Construimos el arreglo
        // grade= new double[size];

        // //Rellenar el arreglo mediante teclado
        // for ( int s = 0; s < grade.length; s++ ){
        //     System.out.println("Escribe la calificación del alumno " + (s+1) + ": ");
        //     entrada = bufer.readLine(); //Leer el valor
        //     grade[s]  = Double.parseDouble(entrada); //Almacenar en el arreglo
        //     suma += grade[s]; //Suma calificaciones a la variable suma
        // }

        // //Calculo de promedio de calificaciones
        // promedio = suma / size;

        //Imprimir el contenido del arreglo usando un for extendido
        // System.out.println("Las calificaciones de los alumnos son:");
        // for ( double calif : grade )
        // System.out.println("Calificación del alumno: " + calif); //Tecla sout para crear la línea de código

        // //Imprimir el promedio del grupo
        // System.out.println("El promedio del grupo es: " + promedio);
    }
}
