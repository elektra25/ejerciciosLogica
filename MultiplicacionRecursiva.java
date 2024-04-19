import java.util.Scanner;

public class MultiplicacionRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,resultado;

        System.out.print("Ingrese el primer número: ");
        a= scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b= scanner.nextInt();

        resultado=multiplicacionRecursiva(a,b);

        System.out.println("La multiplicación recursiva de " + a + " y " + b + " es: " + resultado);
    }

    public static int multiplicacionRecursiva(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacionRecursiva(a, b - 1);
        }
    }
}


