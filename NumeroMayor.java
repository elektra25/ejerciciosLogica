import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mayor = encontrarMayor(numero1, numero2);

        System.out.println("El número mayor es: " + mayor);
    }

    public static int encontrarMayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
