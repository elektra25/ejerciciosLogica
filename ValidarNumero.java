import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado (" + numero + ") es par.");
        } else {
            System.out.println("El número ingresado (" + numero + ") es impar.");
        }
    }
}
