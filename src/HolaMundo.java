
import java.util.Scanner;

//mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        /*
        //primeros ejercicios
        System.out.println("Hola Mundo desde Java");
        System.out.println();
        
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println(miVariableCadena2);

        //segundos ejercicios
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        //terceros ejercicios
        var nombre = "Karla";
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla Doble: \"" + nombre + "\"");
        
        //cuarto ejercicio
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in); //leer informacion de manera dinamica por parte del usuario
        var usuario = consola.nextLine(); //(nextLine)metodo que lee una linea completa de la consola
        System.out.println("Usuario = " + usuario);
        
        System.out.println("Escribe el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        */
        
        //TAREA: Se solicita incluir la siguiente información acerca de un libro: titulo y autor
        System.out.println("Proporciona el titulo:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
