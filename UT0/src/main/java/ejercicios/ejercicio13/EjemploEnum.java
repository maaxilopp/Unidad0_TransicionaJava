package ejercicios.ejercicio13;

public class EjemploEnum {
    // Enum que define las 4 categorías posibles de un carácter
    enum TipoCaracter {VOCAL, CONSONANTE, DIGITO, OTRO}

    public static void main(String[] args) {

        System.out.println("Valores del enum: ");
        for (TipoCaracter t : TipoCaracter.values()) {
            System.out.println(t);
        }
        System.out.println(" ");
        // Contadores, uno por cada categoría
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        int contadorDigitos = 0;
        int contadorOtro = 0;
        String test = "AEIOÚ m.2007";
        System.out.println("Texto: " + test);
        System.out.println(" ");


        // Convertimos todo a minúsculas para simplificar las comparaciones
        test = test.toLowerCase();

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i); // Obtenemos el carácter en la posición i
            TipoCaracter tipo; // Variable que guarda la categoría del carácter actual

            // Clasificamos el carácter según lo que es
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                tipo = TipoCaracter.VOCAL;
            } else if (Character.isLetter(c)) {
                // Si es letra pero no vocal, es consonante
                tipo = TipoCaracter.CONSONANTE;
            } else if (Character.isDigit(c)) {
                tipo = TipoCaracter.DIGITO;
            } else {
                // Espacios, signos de puntuación, etc.
                tipo = TipoCaracter.OTRO;
            }

            // Según la categoría, incrementamos el contador correspondiente
            switch (tipo) {
                case VOCAL:       contadorVocales++;      break;
                case CONSONANTE:  contadorConsonantes++;  break;
                case DIGITO:      contadorDigitos++;      break;
                case OTRO:        contadorOtro++;         break;
            }
        }

        // Mostramos los resultados finales
        System.out.println("Vocales del texto: " + contadorVocales);
        System.out.println("Consonantes del texto: " + contadorConsonantes);
        System.out.println("Digitos del texto: " + contadorDigitos);
        System.out.println("Otros caracteres del texto: " + contadorOtro);
    }
}