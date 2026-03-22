package ejercicios.ejercicio14;

//Transformador T9 con inversión de texto
//Primero invierte el texto después lo transforma a T9
public class TransformadorT9Invertido {

    private final TransformadorT9 transformador;

    public TransformadorT9Invertido() {
        this.transformador = new TransformadorT9();
    }


    public String transformarInvertido(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }

        // Invertir el texto
        String textoInvertido = new StringBuilder(texto).reverse().toString();

        // Transformar a T9
        return transformador.transformar(textoInvertido);
    }

    // Obtiene el texto invertido sin transformar

    public String invertirTexto(String texto) {
        if (texto == null) {
            return null;
        }
        return new StringBuilder(texto).reverse().toString();
    }
}