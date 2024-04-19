import java.util.Scanner;

public class ModuloRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        // Validar que el divisor no sea cero
        if (divisor == 0) {
            System.out.println("Error: no se puede calcular el módulo con un divisor igual a cero.");
        } else {
            int resultado = moduloRecursivo(dividendo, divisor);
            System.out.println("El resultado del módulo de " + dividendo + " entre " + divisor + " es: " + resultado);
        }


    }

    public static int moduloRecursivo(int dividendo, int divisor) {
        // Caso base: si el dividendo es menor que el divisor, el resultado es el propio dividendo
        if (dividendo < divisor) {
            return dividendo;
        }
        // Caso recursivo: resta el divisor del dividendo y llama de nuevo a la función con el nuevo dividendo
        return moduloRecursivo(dividendo - divisor, divisor);
    }
}
