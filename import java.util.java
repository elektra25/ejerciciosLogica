import java.util.Scanner;

class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,suma;
        System.out.println("Ingrese el primer número: ");
        a=scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b=scanner.nextInt();

        suma=a+b;

        System.out.println("La suma es: " + suma);
    }
}
