package ejercicios.ejercicio3;
import java.util.Scanner;

public class Contador {
    static final int MAX_CONT = 10;
    int incremento = 1;
    int contador = 0;

    public static void main(String[] args) {

    // Primero, demuestro diferencia entre un atributo static y uno de instancia
    // En un atributo de instancia, Cada objeto tiene su propio atributo, como en el caso del contador 4 y 5, que tienen distinto incremento pero ambos son contadores igualmente.
    // En un atributo static, el objeto pertenece a la clase, siendo que si se modifica, todos se verían afectados por la modificación, cómo en el caso de MAX_COUNT, por ejemplo.

        Contador contador4 = new Contador();
        contador4.incremento = 2;
        Contador contador5 = new Contador();
        System.out.println("El incremento del contador 4 es: " + contador4.incremento + ". Mientras que el del contador 5 es: " + contador5.incremento + "." );
        System.out.println(" ");

     // Ahora voy al switch, le solicito al usuario una opción.
     // Si el usuario ingresa "1", se mostrará la ejecución con while.
     // Si el usuario ingresa "2", se mostrará la ejecución con do while.
     // Si el usuario ingresa "3", se mostrará la ejecución con for.
     // Si ingresa una opción fuera de esas 3, imprimirá opción invalida, y volverá a pedirle que ingrese una opción valida.

        Scanner scanner = new Scanner(System.in);
        int elegida = 0;
        do {
        System.out.println("Seleccione una opción para ejecutar el conteo. Opción 1. While, Opción 2. Do While,  Opción 3. For");
        elegida = scanner.nextInt();

        switch (elegida) {
            case 1:
                Contador contador1 = new Contador();
                while (contador1.contador < contador1.MAX_CONT) {
                    contador1.contador = contador1.contador + contador1.incremento;
                }
                System.out.println("Contador con While: " + contador1.contador);
                break;

            case 2:
                Contador contador2 = new Contador();
                do {
                    contador2.contador = contador2.contador + contador2.incremento;
                } while (contador2.contador < MAX_CONT);
                System.out.println("Contador con Do While: " + contador2.contador);
                break;

            case 3:
                Contador contador3 = new Contador();
                for (contador3.contador = 0; contador3.contador < MAX_CONT; contador3.contador = contador3.contador + contador3.incremento) {
                }
                System.out.println("Contador con For: " + contador3.contador);
                break;

            default:
                System.out.println("Opción no válida");
            }
          } while (elegida != 1 && elegida != 2 && elegida != 3);
    }
}



