package ejercicios.ejercicio9;

class ContadorPalabras implements ProcesadorTexto {
    //Constructor
    public ContadorPalabras(){}

    @Override
    public int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()){
            return 0;
        }
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }
    // Sobrecarga
    public int contarPalabras(String[] lineas) {
        int total = 0;
        for (String linea : lineas) {
            total += contarPalabras(linea);
        }
        return total;
    }

    // versión que devuelve objeto
    public ResultadoAnalisis analizar(String texto) {
        return new ResultadoAnalisis(contarPalabras(texto));
    }
}
