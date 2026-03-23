package ejercicios.ejercicio03;
import java.util.Scanner;

public class Contador {
    static final int MAX_CONT = 10;
    int incremento = 1;
    int contador = 0;

    public static void main(String[] args) {
        // Primero, demuestro diferencia entre un atributo static y uno de instancia
        // En un atributo de instancia, Cada objeto tiene su propio atributo, como en el caso del contador 4 y 5, que tienen distinto incremento pero ambos son contadores igualmente.
        // En un atributo static, el objeto pertenece a la clase, siendo que si se modifica, todos se verían afectados por la modificación, cómo en el caso de MAX_CONT, por ejemplo,
        // MAX_CONT al ser final también,su valor (10) no puede cambiar nunca.
        demostrarStaticVsInstancia();

        // Luego sigo con el switch, le solicito al usuario una opción.
        // Si el usuario ingresa "1", se mostrará la ejecución con while.
        // Si el usuario ingresa "2", se mostrará la ejecución con do while.
        // Si el usuario ingresa "3", se mostrará la ejecución con for.
        // Si el usuario ingresa "4", se mostrará un mensaje de salida y finalizará la ejecución.
        // Si el usuario ingresa una opción fuera de esas 4, imprimirá opción invalida, y volverá a pedirle que ingrese una opción valida.
        Scanner scanner = new Scanner(System.in);
        int elegida = 0;
        do {
            System.out.println("Seleccione una opción para ejecutar el conteo. Opción 1. While, Opción 2. Do While, Opción 3. For. Si desea terminar la ejecución ingrese 4.");
            elegida = scanner.nextInt();

            switch (elegida) {
                case 1:
                    Contador contador1 = new Contador();
                    while (contador1.contador < Contador.MAX_CONT) {
                        contador1.contador += contador1.incremento;
                    }
                    System.out.println("Contador con While: " + contador1.contador);
                    break;

                case 2:
                    Contador contador2 = new Contador();
                    do {
                        contador2.contador += contador2.incremento;
                    } while (contador2.contador < Contador.MAX_CONT);
                    System.out.println("Contador con Do While: " + contador2.contador);
                    break;

                case 3:
                    Contador contador3 = new Contador();
                    for (contador3.contador = 0; contador3.contador < Contador.MAX_CONT; contador3.contador += contador3.incremento) {
                    }
                    System.out.println("Contador con For: " + contador3.contador);
                    break;

                case 4:
                    System.out.println("Finalizando ejecución...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (elegida != 4);
    }

    private static void demostrarStaticVsInstancia() {
        Contador contador4 = new Contador();
        contador4.incremento = 2;
        Contador contador5 = new Contador();
        System.out.println("El incremento del contador 4 es: " + contador4.incremento + ". Mientras que el del contador 5 es: " + contador5.incremento + ".");
        System.out.println(" ");
    }
}
