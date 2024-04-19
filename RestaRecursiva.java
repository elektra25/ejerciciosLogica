import java.util.Scanner;

class RestaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,resultado;
        System.out.println("Ingrese el primer número: ");
        a= scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b= scanner.nextInt();

        resultado=restaRecursiva(a,b);

        System.out.println("La resta recursiva de " + a + " y " + b + " es: " + resultado);

    }

    public static int restaRecursiva(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return restaRecursiva(a - 1, b - 1);
        }
    }
}
