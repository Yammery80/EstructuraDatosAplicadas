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
    //Función para mostrar los datos
    public static void imprimirAlumnos(){
        System.out.println("Contenido del arreglo alumnos: ");
        for (Alumno a: alumnos){
            System.out.println("----------------------- ");
            System.out.println("Información del alumno: ");
            System.out.println(a.toString());
        }
    }
    //Funcion para calcular Promedio Grupal
    public static double calcularPromedioGrupo(){
        double suma = 0;
        for (Alumno a: alumnos){
            suma += a.getAverage();
        }
        return (suma / alumnos.length);
    }
    
    //Funcion para calcular Promedio Grupal Estructuras
    public static double PromedioGrupoStructures(){
        double suma = 0;
        for (Alumno a: alumnos){
            suma += a.getStructures();
        }
        return (suma / alumnos.length);
    }

    //Funcion para calcular Promedio Grupal Inglés
    public static double PromedioGrupoEnglish(){
        double suma = 0;
        for (Alumno a: alumnos){
            suma += a.getEnglish();
        }
        return (suma / alumnos.length);
    }

    //Funcion para calcular Promedio Grupal IoT
    public static double PromedioGrupoIot(){
        double suma = 0;
        for (Alumno a: alumnos){
            suma += a.getIot();
        }
        return (suma / alumnos.length);
    }

    public static void main(String[] args) throws IOException {
        int size; //Tamaño del grupo
        double AverageGroup; //Promedio del grupo
        double AverageStructures; //Promedio del grupo de Estructuras
        double AverageEnglish; //Promedio del grupo de Inglés
        double AverageIot; //Promedio del grupo de IoT

        // Recuperando el tamaño del arreglo
        System.out.println("Bienvenido a su sistema de cálculo de promedio grupal:");
        System.out.println("¿Cuantos alumnos son en el salón?: ");
        entrada = bufer.readLine();//Lectura del teclado
        size = Integer.parseInt(entrada); //Conversión de String a Int

        //Construir arreglo alumnos
        alumnos = new Alumno[size];

        //Introducir información de los alumnos
        leerAlumnos();

        //Calcular el promedio del grupo
        AverageGroup = calcularPromedioGrupo();
        //Calcular el promedio del Structures
        AverageStructures = PromedioGrupoStructures();
        //Calcular el promedio del Inglés
        AverageEnglish = PromedioGrupoEnglish();
        //Calcular el promedio del IoT
        AverageIot = PromedioGrupoIot();

        //Mostrar la información
        imprimirAlumnos();

        System.out.println("-----------------------");
        System.out.println("El promedio de grupo es: " + AverageGroup);
        System.out.println("-----------------------");
        System.out.println("El promedio de Estructuras es: " + AverageStructures);
        System.out.println("-----------------------");
        System.out.println("El promedio de Inglés es: " + AverageEnglish);
        System.out.println("-----------------------");
        System.out.println("El promedio de IoT es: " + AverageIot);
    }
}
