package ejercicios.ejercicio14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GestorArchivos {

    private final TransformadorT9 transformador;
    private final TransformadorT9Invertido transformadorInvertido;

    public GestorArchivos() {
        this.transformador = new TransformadorT9();
        this.transformadorInvertido = new TransformadorT9Invertido();
    }

    //Lee un archivo y lo transforma a T9
    public void transformarArchivo(String rutaEntrada, String rutaSalida) throws IOException {
        validarRutaEntrada(rutaEntrada);

        List<String> lineas = Files.readAllLines(Paths.get(rutaEntrada));
        StringBuilder resultado = new StringBuilder();

        for (String linea : lineas) {
            String lineaT9 = transformador.transformar(linea);
            resultado.append(lineaT9).append("\n");
        }

        escribirArchivo(rutaSalida, resultado.toString());
    }

    //Lee un archivo y lo transforma a T9 (versión invertida)
    public void transformarArchivoInvertido(String rutaEntrada, String rutaSalida) throws IOException {
        validarRutaEntrada(rutaEntrada);

        List<String> lineas = Files.readAllLines(Paths.get(rutaEntrada));
        StringBuilder resultado = new StringBuilder();

        for (String linea : lineas) {
            String lineaT9 = transformadorInvertido.transformarInvertido(linea);
            resultado.append(lineaT9).append("\n");
        }

        escribirArchivo(rutaSalida, resultado.toString());
    }

    //Lee contenido de un archivo
    public String leerArchivo(String ruta) throws IOException {
        validarRutaEntrada(ruta);
        return new String(Files.readAllBytes(Paths.get(ruta)));
    }

    //Escribe contenido en un archivo
    public void escribirArchivo(String ruta, String contenido) throws IOException {
        Files.write(Paths.get(ruta), contenido.getBytes());
    }


    private void validarRutaEntrada(String ruta) throws FileNotFoundException {
        if (!Files.exists(Paths.get(ruta))) {
            throw new FileNotFoundException("Archivo no encontrado: " + ruta);
        }
    }
}