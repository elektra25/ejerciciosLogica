import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        double area = calcularAreaTriangulo(base, altura);

        System.out.println("El área del triángulo es: " + area);

    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
