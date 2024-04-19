import java.util.Scanner;

class MultiplicacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,mul;
        System.out.println("Ingrese el primer número: ");
        a=scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b=scanner.nextInt();

        mul=a*b;

        System.out.println("La multiplicacion es: " + mul);
    }
}
