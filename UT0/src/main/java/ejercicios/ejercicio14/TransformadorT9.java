package ejercicios.ejercicio14;

import java.util.HashMap;
import java.util.Map;


public class TransformadorT9 {

    private static final Map<Character, String> MAPEO_T9 = new HashMap<>();

    static {
        // Inicializar mapeo de caracteres a T9
        MAPEO_T9.put('A', "2");
        MAPEO_T9.put('B', "22");
        MAPEO_T9.put('C', "222");
        MAPEO_T9.put('D', "3");
        MAPEO_T9.put('E', "33");
        MAPEO_T9.put('F', "333");
        MAPEO_T9.put('G', "4");
        MAPEO_T9.put('H', "44");
        MAPEO_T9.put('I', "444");
        MAPEO_T9.put('J', "5");
        MAPEO_T9.put('K', "55");
        MAPEO_T9.put('L', "555");
        MAPEO_T9.put('M', "6");
        MAPEO_T9.put('N', "66");
        MAPEO_T9.put('O', "666");
        MAPEO_T9.put('P', "7");
        MAPEO_T9.put('Q', "77");
        MAPEO_T9.put('R', "777");
        MAPEO_T9.put('S', "7777");
        MAPEO_T9.put('T', "8");
        MAPEO_T9.put('U', "88");
        MAPEO_T9.put('V', "888");
        MAPEO_T9.put('W', "9");
        MAPEO_T9.put('X', "99");
        MAPEO_T9.put('Y', "999");
        MAPEO_T9.put('Z', "9999");
        MAPEO_T9.put(' ', "0");
    }

    //Transforma un texto a T9
    public String transformar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();
        String textoMayuscula = texto.toUpperCase();

        for (int i = 0; i < textoMayuscula.length(); i++) {
            char c = textoMayuscula.charAt(i);

            if (!MAPEO_T9.containsKey(c)) {
                throw new IllegalArgumentException(
                        "Carácter no soportado en T9: '" + c + "'"
                );
            }

            if (i > 0 && resultado.length() > 0) {
                resultado.append("-");
            }
            resultado.append(MAPEO_T9.get(c));
        }

        return resultado.toString();
    }

    //Obtiene mapeo T9
    public static Map<Character, String> obtenerMapeoT9() {
        return new HashMap<>(MAPEO_T9);
    }

  //Verifica si un caracter es válido en T9
    public static boolean esCaracterValido(char caracter) {
        return MAPEO_T9.containsKey(Character.toUpperCase(caracter));
    }
}