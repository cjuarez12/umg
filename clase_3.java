import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Validar signo de un número");
            System.out.println("2 - Validar Tipo año");
            System.out.println("3 - Suma con evaluación negativa");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");

      
            opcion = leerOpcion(scanner);

            // Controlar las opciones con el switch
            switch (opcion) {
                case 1:
                    validarSigno(scanner);
                    break;
                case 2:
                    validarAnio(scanner);
                    break;
                case 3:
                    sumaConEvaluacionNegativa(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    // Método para validar el signo de un número
    public static void validarSigno(Scanner scanner) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        pressEnterToContinue();

    }

    // Método para validar si el año es bisiesto o no
    public static void validarAnio(Scanner scanner) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
        pressEnterToContinue();

    }

    // Método para realizar una suma con evaluación negativa
    public static void sumaConEvaluacionNegativa(Scanner scanner) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        // Evaluación negativa de la suma
        if (suma < 0) {
            System.out.println("La suma es negativa: " + suma);
        } else {
            System.out.println("La suma es positiva o cero: " + suma);
        }
        pressEnterToContinue();


    }

    public static void pressEnterToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    private static int leerOpcion(Scanner scanner) {
        int opcion = -1;
        while (true) {
            try {
                opcion = Integer.parseInt(scanner.nextLine()); // Intentar leer como entero
                if (opcion >= 0 && opcion <= 3) {
                    
                } else {
                    System.out.println("Por favor, ingrese una opción válida entre 0 y 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número.");
            }
            return opcion; // Validar que la opción esté en el rango esperado
        }
    }

}
