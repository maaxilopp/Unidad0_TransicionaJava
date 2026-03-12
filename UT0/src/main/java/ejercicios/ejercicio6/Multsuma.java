package ejercicios.ejercicio6;
// La sobrecarga de metodos permite tener dos metodos con el mismo nombre, en este caso "multsuma", pero diferentes parametros.
// Java, decide cual ejecutar segun los argumentos que recibe.
public class Multsuma {
        // Sobrecarga de multsuma para tipos de datos double, numeros reales con gran precisión hasta 15 0 17 decimales luego de la coma.
        public static double multsuma (double a,double b, double c){
            return a * b + c;
        }
        // Sobrecarga de multsuma para tipos de datos int, los enteros.
        public static int multsuma(int a, int b, int c){
            return a * b + c;
        }
    public static void main(String[] args) {
        // Llama a la versión double al ingresar números decimales, con coma, en este caso, al ejecutar imprimirá 2.0.
        System.out.println("El resultado de multsuma con double es: " + multsuma(1.0, 1.0, 1.0));
        // Llama a la versión int al ingresar números enteros, sin coma, en este caso, al ejecutar imprimirá 2.
        System.out.println("El resultado de multsuma con int es: " + multsuma(1, 1, 1)); .
    }
}

