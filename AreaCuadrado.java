import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cuadrado: "); 
        double lado = scanner.nextDouble();

        double area = calcularAreaCuadrado(lado);

        System.out.println("El área del cuadrado con lado " + lado + " es: " + area);
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }
}
