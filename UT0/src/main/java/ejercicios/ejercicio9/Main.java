package ejercicios.ejercicio9;

public class Main {
    public static void main(String[] args) {

        ContadorPalabras cp = new ContadorPalabras();

        System.out.println("Sobrecarga con String:");
        System.out.println(cp.contarPalabras("Hola mundo"));

        System.out.println("Sobrecarga con array:");
        String[] lineas = {"Hola mundo", "Me llamo trini"};
        System.out.println(cp.contarPalabras(lineas));

        ProcesadorTexto simple = new ContadorPalabras();
        ProcesadorTexto avanzado = new ContadorPalabrasAvanzado();

        String texto = "Hola, mundo!";

        System.out.println("\nSobreescritura:");
        System.out.println("Simple: " + simple.contarPalabras(texto));
        System.out.println("Avanzado: " + avanzado.contarPalabras(texto));

        ResultadoAnalisis resultado = cp.analizar("Hola mundo desde Java");

        System.out.println("\ntoString:");
        System.out.println(resultado); // usa toString automáticamente
    }
}