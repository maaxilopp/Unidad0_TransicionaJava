package ejercicios.ejercicio10;

public class Main {
    public static void main(String[] args) {
        ContadorPalabras cp = new ContadorPalabras();
        String[] lineas = cp.obtenerLineas("ejercicios/ejercicio10/archivo.txt");
        System.out.println("Palabras: " + cp.CalcularCantPalabrasLinea(lineas));
    }
}