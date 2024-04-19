import java.util.Scanner;

public class NumeroEnBucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Iterando del 0 al " + numero + ":");
        iterarNumeros(numero);
    }

    public static void iterarNumeros(int numero) {
        if (numero >= 0) {
            iterarNumerosRecursivo(0, numero);
        } else {
            System.out.println("El número ingresado debe ser mayor o igual a 0.");
        }
    }

    public static void iterarNumerosRecursivo(int actual, int limite) {
        if (actual <= limite) {
            System.out.println(actual);
            iterarNumerosRecursivo(actual + 1, limite);
        }
    }
}
