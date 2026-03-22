package ejercicios.ejercicio02;


class ArithmeticDemo {
    public static void main(String[] args) {
        {
            int result = 1 + 2;  //Asignaciones compuestas
            result = result - 1; // result -= 1
            result = result * 2; // result *= 2
            result = result / 2; // result /= 2
            result = result + 8; // result += 8
            result = result % 7; // result %=7
            System.out.println(result);

            //tomar argumentos de linea de comando y pasarlos a valores numericos tipo int
            if (args.length < 2) {
                System.out.println("Uso: ArithmeticDemo <num1> <num2>");
                return;
            }


            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);

                System.out.println("primer argumento " + args[0]);
                System.out.println("segundo argumento " + args[1]);

                System.out.println("Suma: " + (arg1 + arg2));
                System.out.println("Resta: " + (arg1 - arg2));
                System.out.println("Multiplicacion: " + (arg1 * arg2));

                if (arg2 != 0) {
                    System.out.println("Dividir: " + (arg1 / arg2));
                    System.out.println("Modulo: " + (arg1 % arg2));
                } else {
                    System.out.println("No se puede dividir ni calcular modulo por 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: ambos argumentos deben ser enteros validos.");
            }
        }
    }
}

/*Explicar con detalle qué ocurre en la instrucción: int a = 5; int i = 3; a += ++i;
    Se le asigna 5 a la variable a y 3 a la variable i.
    a += ++i es equivalente a realizar a + (i + 1)
 */
