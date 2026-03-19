package ejercicios.ejercicio9;


public class ContadorPalabrasAvanzado extends ContadorPalabras {

    @Override
    public int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        // elimina signos de puntuación
        String limpio = texto.replaceAll("[áéíóúÁÉÍÓÚñÑ]", "");

        return super.contarPalabras(limpio);
    }
}