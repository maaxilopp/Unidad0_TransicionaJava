package ejercicios.ejercicio11;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void leerEntradaArchivo(String rutaArchivo) {
        try {
            Scanner sc = new Scanner(new File(rutaArchivo));
            int num_entero = sc.nextInt();
            double num_real = sc.nextDouble();
            String cadena_texto = sc.next();

            System.out.println("El entero del archivo es: " + num_entero);// entero
            System.out.println("El real del archivo es:  " + num_real);// double
            System.out.println("La cadena de texto del archivo es: " + cadena_texto);// cadena de texto del archivo
            System.out.println("La suma del entero y el real da: " + (num_entero + num_real)); // suma
            System.out.println("La division entera del entero y el real da: " + num_entero / (int)num_real);// división entera
            System.out.println("Y el resto de la división es: " + num_entero % (int)num_real);// resto
            System.out.println(" ");
            sc.close();

        } catch (FileNotFoundException e) { //excepción si no se encuentra el archivo
            System.out.println("No se encontró el archivo :(");
        } catch (InputMismatchException e ){ // excepción si hay algún formato invalido en alguno de los datos
            System.out.println("Formato Incorrecto :((");

        }
    }
    public static void leerEntradaStdin() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese Radio del perimetro: ");
            double radio = sc.nextDouble();
            double area = Math.PI * radio * radio;
            double perimetro = Math.PI * 2 * radio;
            System.out.println("En base al radio ingresado, el área del circulo es: " + area + " Y el perimetro es: " + perimetro);
            sc.close();
        }catch (InputMismatchException e ){// excepción si hay algún formato invalido en alguno de los datos
            System.out.println("Formato incorrecto al ingresar datos :((");
        }
    }

    public static void main(String[] args) {
        leerEntradaArchivo("ejercicios/ejercicio11/Archivo_ej11.txt");
        leerEntradaStdin();

    }
}