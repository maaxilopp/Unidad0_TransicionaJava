package ejercicios.ejercicio07;
public class StringDemo {

    public static void main(String[] args) {
        // Palíndromos
        String frase1 = "Did Hannah see bees? Hannah did.";
        String frase2 = "Anita lava la tina";

        probarPalindromo(frase1);
        probarPalindromo(frase2);

        // Métodos de string
        String texto = "  Hola Mundo Hola  ";
        System.out.println("\n Métodos de String");

        System.out.println("substring(2, 6): " + texto.substring(2, 6));
        System.out.println ("split: " + texto.split(" ")[1]);
        System.out.println("subSequence(2, 6): " + texto.subSequence(2, 6));
        System.out.println("trim(): '" + texto.trim() + "'");
        System.out.println("toLowerCase(): " + texto.toLowerCase());
        System.out.println("toUpperCase(): " + texto.toUpperCase());
        System.out.println("indexOf('Hola'): " + texto.indexOf("Hola"));
        System.out.println("lastIndexOf('Hola'): " + texto.lastIndexOf("Hola"));
        System.out.println("contains('Mundo'): " + texto.contains("Mundo"));
        System.out.println("replace('Hola', 'Hi'): " + texto.replace("Hola", "Hi"));
        System.out.println("replaceAll('o', '0'): " + texto.replaceAll("o", "0"));
        System.out.println("replaceFirst('Hola', 'Hey'): " + texto.replaceFirst("Hola", "Hey"));


        //Microconsultas
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("Longitud: " + hannah.length());
        System.out.println("Carácter en índice 12: " + hannah.charAt(12));
        System.out.println("Substring(4, 10): " + hannah.substring(4, 10));
    }

    //Función palíndromo
    public static void probarPalindromo(String frase) {

        // Normalizar: minúsculas y sin signos
        String limpia = frase.toLowerCase().replaceAll("[áéíóú]", "");

        String invertida = new StringBuilder(limpia).reverse().toString();

        System.out.println("\nFrase: " + frase);
        System.out.println("Normalizada: " + limpia);
        System.out.println("Invertida: " + invertida);

        if (limpia.equals(invertida)) {
            System.out.println("Resultado: Es palíndromo");
        } else {
            System.out.println("Resultado: No es palíndromo");
        }
    }
}