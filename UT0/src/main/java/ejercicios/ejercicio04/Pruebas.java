package ejercicios.ejercicio04;

import static ejercicios.ejercicio04.UtilMath.*;

public class Pruebas {
// Pruebas esperadas:
// factorial(5)  = 120
// factorial(0)  = 1
// factorial(1)  = 1
// factorial(-1) = mensaje de excepción
// isPrime(7)    = true, Suma de pares hasta 7: 12

    public static void main(String[] args) {

        // Prueba de factorial
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Factorial de 0: " + factorial(0));
        System.out.println("Factorial de 1: " + factorial(1));
        try {
            System.out.println("Factorial de -1: " + factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial de -1: " + e.getMessage());
        }


        long n = 7;

        if (isPrime(n)) {
            System.out.println(n + " es primo");
            System.out.println("Suma de pares de " + n + ": " + sumaParesHasta(n));
        } else {
            System.out.println(n + " no es primo");
            System.out.println("Suma de impares de " + n + ": " + sumaImparesHasta(n));
        }
    }
}
