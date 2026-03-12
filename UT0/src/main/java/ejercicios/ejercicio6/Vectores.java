package ejercicios.ejercicio6;
import java.util.Arrays;
import java.util.Scanner;

// En el programa hago una multiplicación de los elementos en la misma posición de dos vectores si sus tamaños son iguales.

public class Vectores {
    static int[] array1; // Primer vector
    static int[] array2; // Segundo vector
    static int[] array3; // Tercer vector (resultado)

    static Scanner sc = new Scanner(System.in);

    // En entrada se le solicita al usuario tamaño de los vectores y que valor va a tener cada elemento del mismo.
    static void entrada() {
        System.out.println("Seleccione el tamaño de el primer vector: ");
        int tamaño1 = sc.nextInt();
        array1 = new int[tamaño1];
        array3 = new int[tamaño1]; // Le pongo el mismo tamaño de array 1, para que ya quede marcado el tamaño en caso que se cumplan las condiciones para la multiplicación más tarde.
        System.out.println("Seleccione el tamaño de el segundo vector: ");
        int tamaño2 = sc.nextInt();
        array2 = new int[tamaño2];
        for (int i = 0; i < tamaño1; i++) { // le pongo los valores a array 1
            System.out.println("Seleccione el elemento número " + i + " (recuerda que los vectores arrancan desde 0) de su primer vector: ");
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < tamaño2; i++) { // le pongo los valores a array 2
            System.out.println("Seleccione el elemento número " + i + " (recuerda que los vectores arrancan desde 0) de su segundo vector: ");
            array2[i] = sc.nextInt();
        }
    }
    // En calculo, arranco verificando que se cumpla que ambos vectores tengan la misma longitud.
    //En caso de que se cumpla la condición, multiplico los elementos de igual posición y le asigno el resultado a la misma posición del vector resultado.
    static void calcular() {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i] * array2[i];
            }
        }
    }
    // En salida muestro como queda el vector resultado luego de las multiplicaciones.
    // Si la multiplicación no se pudo hacer, se le notifica al usuario.
    static void salida() {
        if (array2.length == array1.length) {
            System.out.println("El resultado de la multiplicación de el vector: " + Arrays.toString(array1) + " por el vector: " + Arrays.toString(array2) + " Es igual a: " + Arrays.toString(array3) + ".");
        } else {
            System.out.println("Operación invalida, vectores de diferente longitud.");
        }
    }


    public static void main(String[] args) {
        entrada();
        calcular();
        salida();
    }
}