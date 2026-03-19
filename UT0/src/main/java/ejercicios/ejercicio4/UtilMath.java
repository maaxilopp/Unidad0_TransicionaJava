package  ejercicios.ejercicio4;

public class UtilMath {
    public static int factorial(int num) {
        // Caso borde: número negativo
        if (num < 0) {
            throw new IllegalArgumentException("El factorial no está definido para negativos");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        int resultado = 1;

        // Multiplica todos los números desde 1 hasta num
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false; // Descartamos los números pares porque no pueden ser primos

        for (long i = 3; i <= n / i; i += 2) {
            // Solo se prueban divisores hasta la raíz de n porque si un número
            // tiene un divisor mayor que su raíz cuadrada, existe otro menor que ya habría sido encontrado antes.
            if (n % i == 0) return false;
        }
        return true;
    }


    // Suma de pares
    public static long sumaParesHasta(long n) {
        long suma = 0;
        long i = 0;

        while (i <= n) {
            // Se utiliza while para recorrer los números desde 0 hasta n. Sirve porque no se necesita un
            // número fijo de iteraciones, sino repetir el proceso mientras se cumpla que i <= n.
            if (i % 2 == 0) {
                suma += i;
            }
            i++;
        }

        return suma;
    }

    // Suma de impares
    public static long sumaImparesHasta(long n) {
        long suma = 0;
        long i = 0;

        while (i <= n) {
            if (i % 2 != 0) {
                suma += i;
            }
            i++;
        }

        return suma;

    }
}
