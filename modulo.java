import java.util.Scanner;

class ModuloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,mod;
        System.out.println("Ingrese el primer número: ");
        a=scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b=scanner.nextInt();

        mod=a%b;

        System.out.println("El Modulo es: " + mod);
    }
}
