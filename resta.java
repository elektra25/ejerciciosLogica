import java.util.Scanner;

class RestaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,resta;
        System.out.println("Ingrese el primer número: ");
        a=scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b=scanner.nextInt();

        resta=a-b;

        System.out.println("La resta es: " + resta);
    }
}

