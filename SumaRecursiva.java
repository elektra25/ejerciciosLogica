import java.util.Scanner;

class SumaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,resultado;
        System.out.println("Ingrese el primer número: ");
        a= scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b=scanner.nextInt();

        resultado=sumaRecursiva(a,b);

        System.out.println("La suma recursiva de " + a + " y " + b + " es: " + resultado);
    }

    public static int sumaRecursiva(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sumaRecursiva(a ^ b, (a & b) << 1);
        }
    }
}
