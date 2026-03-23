package ejercicios.ejercicio01;


class PruebasAtributos {

    // Atributos de instancia
    int numero;
    boolean activo;
    double precio;
    char letra;
    String texto;

    public static void main(String[] args) {

        // Crear objeto para acceder a los atributos
        PruebasAtributos p = new PruebasAtributos();

        // Mostrar valores por defecto
        System.out.println("Valores por defecto:");
        System.out.println("int numero = " + p.numero);
        System.out.println("boolean activo = " + p.activo);
        System.out.println("double precio = " + p.precio);
        System.out.println("char letra = '" + p.letra + "'");
        System.out.println("String texto = " + p.texto);

        /* Variables locales con errores
        int a;
        boolean b;
        System.out.println(a);
        System.out.println(b);

       Esto no compila porque las variables locales no tienen valor por defecto
       a diferencia de los atributos
       */

        // Nombres de variables válidos

        int edad;
        int numero1;
        int _valor;
        int $precio;

        /* Nombres inválidos

        int 1numero;
        Error: no se pueden iniciar con números

        int class;
        Error: palabra reservada

        int mi-variable;
        Error: no se permiten guiones

        int mi variable;
        Error: no se permiten espacios

         */
    }
}