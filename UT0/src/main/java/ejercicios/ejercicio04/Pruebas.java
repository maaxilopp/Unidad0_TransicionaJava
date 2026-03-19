package ejercicios.ejercicio04;

import static ejercicios.ejercicio4.UtilMath.*;

public class Pruebas {

    public static void main(String[] args) {

        // Prueba de factorial
        System.out.println("Factorial de 5: " + factorial(5));

        long n = 7;

        if (isPrime(n)) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }

        System.out.println("Suma de pares: " + sumaParesHasta(n));
        System.out.println("Suma de impares: " + sumaImparesHasta(n));
    }
}