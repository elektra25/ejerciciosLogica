import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Cerrar programa");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma(scanner);
                    break;
                case 2:
                    realizarResta(scanner);
                    break;
                case 3:
                    realizarMultiplicacion(scanner);
                    break;
                case 4:
                    realizarDivision(scanner);
                    break;
                case 5:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 5);
    }

    public static void realizarSuma(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void realizarResta(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMultiplicacion(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void realizarDivision(Scanner scanner) {
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
}

