package ejercicios.ejercicio10;
//importamos las colecciones. La necestiamos porque no sabemos el largo del archivo de antemano

import java.util.ArrayList;
import java.util.Scanner; // Liberaria para leer strings



public class ContadorPalabras {
    public String[] obtenerLineas(String archivo) {
        ArrayList<String> lineas = new ArrayList<>();
        try { //en caso de fallar en la lectura del archivo lanza una expecion.
            Scanner scan = new Scanner(archivo);
            while (scan.hasNextLine()) {
                String nuevaLinea = scan.nextLine();
                lineas.add(nuevaLinea);
            }
            scan.close();
            //pasamos de la coleccion al arreglo para poder retornarlo.
            //Creamos el arreglo en base al largo de la coleccion
        } catch (Exception e ){
            System.out.println("Error al leer");
        }
        int largoColeccion = lineas.size();
        String[] ArrLineas = new String[largoColeccion];
        for (int i = 0; i < largoColeccion; i++) {
            ArrLineas[i] = lineas.get(i);
        }
        return ArrLineas;
    }

    public int CalcularCantPalabrasLinea(String[] arr) {
        int contadorPalabras = 0;
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(arr[i]);
            while (scan.hasNext()) {
                contadorPalabras++; //si existe un palabra cuenta
                scan.next(); //llama a la siguiente palabra
            }
            scan.close();
        }
        return contadorPalabras;
    }

    //Inserccion con Colecciones
    public ArrayList<String> palabrasComunes(String[] a, String[] b) {
        //Obtenemos el string mas largo.
        ArrayList<String> PalabrasEnAmbos = new ArrayList<>();
        if (a.length < b.length) {
            int max = a.length;
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i].equals(b[j])) {
                        PalabrasEnAmbos.add(a[i]);
                    }
                }
            }
        } else {
            int max = b.length;
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (b[i].equals(a[j])) {
                        PalabrasEnAmbos.add(b[i]);
                    }
                }
            }
        }
        return PalabrasEnAmbos;
    }

    //con Arreglos
    public String[] palabrasComunesAreglos(String[] a, String[] b) {
        //Tenemos que comprar el largo de los arreglos. El tamaño del nuevo arreglo que contendra las palabras comunes
        // va a ser el mismo que el de menor largo.
        int min;
        if (a.length < b.length) {
            min = a.length;
        } else {
            min = b.length;
        }
        String[] comunes = new String[min];

        if (a.length < b.length) {
            for (int i = 0; i < a.length; i++) { //Agarramos los elementos de a
                for (int j = 0; j < b.length; j++) { //Recorremos todo b por aca elemento de a
                    if (a[i].equals(b[j])) {
                        comunes[i] = a[i];
                    }
                }
            }
        } else {
            for (int i = 0; i < b.length; i++) { //Agarramos los elementos de b
                for (int j = 0; j < a.length; j++) { //Recorremos todo a por aca elemento de a
                    if (b[i].equals(a[j])) {
                        comunes[i] = b[i];
                        break;
                    }
                }
            }
        }
        return comunes;
    }
}

/*
Comparación:

Arreglos:

-->Ventajas:
- Menor consumo de memoria (no tienen sobrecarga adicional).
- Acceso rápido por índice.

-->Desventajas:
- Tamaño fijo: es necesario conocer o estimar el tamaño previamente.
- Mayor complejidad en la implementación.
- Menor flexibilidad ante cambios o ampliaciones,menos robusto.
- Código más difícil de mantener al larrgo plazo.


Colecciones:

-->Ventajas:
- Tamaño dinámico (crece según la necesidad).
- Código más simple y legible.
- Métodos ya implementados (add, contains, etc.).
- Más fácil de mantener y extender.

-->Desventajas:
- Mayor consumo de memoria (sobrecarga de la colección).
- Requiere importar librerías.


*/
