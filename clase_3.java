import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            clearScreen();
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Validar signo de un número");
            System.out.println("2 - Validar Tipo año");
            System.out.println("3 - Suma con evaluación negativa");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");

            opcion = leerOpcion(scanner);

            switch (opcion) {
                case 1:
                    validarSigno(scanner);
                    break;
                case 2:
                    
                    System.out.println("Opción tipo año");
                    pressEnterToContinue(scanner);
                    break;

                case 3:
                    System.out.println("Opción con evaluación negativa");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 0);
        scanner.close();
    }

    public static void validarSigno(Scanner scanner) {
        clearScreen();
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        scanner.nextLine();  

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        pressEnterToContinue(scanner);
    }



    public static void pressEnterToContinue(Scanner scanner)
    {
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();  
    }

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int leerOpcion(Scanner scanner) {
        int opcion = -1;
      
            try {
                opcion = Integer.parseInt(scanner.nextLine()); // Intentar leer como entero
                if (!(opcion >= 0 && opcion <= 3)) {
                    System.out.println("Por favor, ingrese una opción válida entre 0 y 3.");
                    pressEnterToContinue(scanner);
                } 
            } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor ingrese un número.");
                    pressEnterToContinue(scanner);
            }
            
            return opcion;
            
        
    }

}
