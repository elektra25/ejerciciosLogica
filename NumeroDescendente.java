import java.util.Scanner;

public class NumeroDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int[] numerosOrdenados = ordenarNumeros(numero1, numero2, numero3);

        System.out.println("Los números ordenados de mayor a menor son:");
        for (int numero : numerosOrdenados) {
            System.out.println(numero);
        }

    }

    public static int[] ordenarNumeros(int a, int b, int c) {
        int[] resultado = new int[3];

        if (a >= b && a >= c) {
            resultado[0] = a;
            int[] ordenados = ordenarNumeros(b, c, a);
            resultado[1] = ordenados[0];
            resultado[2] = ordenados[1];
        } else if (b >= a && b >= c) {
            resultado[0] = b;
            int[] ordenados = ordenarNumeros(a, c, b);
            resultado[1] = ordenados[0];
            resultado[2] = ordenados[1];
        } else {
            resultado[0] = c;
            int[] ordenados = ordenarNumeros(a, b, c);
            resultado[1] = ordenados[0];
            resultado[2] = ordenados[1];
        }

        return resultado;
    }
}
