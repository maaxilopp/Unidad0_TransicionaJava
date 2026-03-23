package ejercicios.ejercicio10;
//importamos las colecciones. La necestiamos porque no sabemos el largo del archivo de antemano

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner; // Liberaria para leer strings



public class ContadorPalabras {
    public String[] obtenerLineas(String archivo) {
        ArrayList<String> lineas = new ArrayList<>();
        try { //en caso de fallar en la lectura del archivo lanza una expecion.
            Scanner scan = new Scanner(new File(archivo));
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
        for (String linea: arr) {
            Scanner scan = new Scanner(linea);
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
    public String[] palabrasComunesArreglos(String[] a, String[] b) {
        int min = Math.min(a.length, b.length);
        String[] comunes = new String[min];
        int contador = 0;

        for (String palabraA : a) {
            for (String palabraB : b) {
                if (palabraA.equals(palabraB)) {
                    // Verificar si ya está agregada (evitar duplicados)
                    boolean existe = false;
                    for (int k = 0; k < contador; k++) {
                        if (comunes[k] != null && comunes[k].equals(palabraA)) {
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        comunes[contador] = palabraA;
                        contador++;
                    }
                    break;
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
