import java.util.Scanner;

class DivisionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,div;
        System.out.println("Ingrese el primer número: ");
        a=scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b=scanner.nextInt();

        div=a/b;

        System.out.println("La division es: " + div);
    }
}
