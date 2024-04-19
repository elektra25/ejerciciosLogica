import java.util.Scanner;

public class NumerosEnBucleDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Iterando desde " + numero + " hacia atrás:");
        iterarNumerosHaciaAtras(numero);
    }

    public static void iterarNumerosHaciaAtras(int numero) {
        if (numero >= 0) {
            iterarNumerosHaciaAtrasRecursivo(numero);
        } else {
            System.out.println("El número ingresado debe ser mayor o igual a 0.");
        }
    }

    public static void iterarNumerosHaciaAtrasRecursivo(int actual) {
        if (actual >= 0) {
            System.out.println(actual);
            iterarNumerosHaciaAtrasRecursivo(actual - 1);
        }
    }
}
