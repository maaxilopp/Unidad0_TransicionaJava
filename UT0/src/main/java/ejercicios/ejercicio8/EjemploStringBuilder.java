package ejercicios.ejercicio8;

public class EjemploStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("Original: " + sb);

        System.out.println("Longitud de la cadena: " + sb.length());    // 26
        System.out.println("Capacidad inicial: " + sb.capacity());       // 42 (16 + 26)

        // append, agrega al final
        sb.append(" Hola.");
        System.out.println("append: " + sb);

        // insert, inserta en una posición
        sb.insert(0, "Hola, ");
        System.out.println("insert: " + sb);

        // delete, borra rango [inicio, fin)
        sb.delete(0, 6);
        System.out.println("delete: " + sb);
        // deleteCharAt, borra un caracter por índice
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sb);

        // reverse, invierte
        sb.reverse();
        System.out.println("reverse: " + sb);

        // setLength, recorta/extiende
        sb.setLength(5);
        System.out.println("setLength: " + sb);

        // ensureCapacity, cambia capacidad, no texto
        System.out.println("Capacidad antes: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("Capacidad después: " + sb.capacity());
    }
}