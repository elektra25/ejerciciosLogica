import java.util.Scanner;

public class NumerosIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (sonIguales(numero1, numero2)) {
            System.out.println("Los números ingresados son iguales.");
        } else {
            System.out.println("Los números ingresados no son iguales.");
        }

    }

    public static boolean sonIguales(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
