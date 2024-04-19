import java.util.Scanner;

class DivisionRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        int divisor= scanner.nextInt();
        System.out.println("Ingrese el divisor: ");
        int dividendo= scanner.nextInt();

        // Validar que el divisor no sea cero
        if (dividendo == 0) {
            System.out.println("Error: no se puede dividir por cero.");
        } else {
        int resultado = divisionRecursiva(divisor, dividendo);
            System.out.println("El resultado de la división recursiva de " + divisor + " entre " + dividendo + " es: " + resultado);
        }

    }

    public static int divisionRecursiva(int divisor, int dividendo) {
        if (divisor < dividendo) {
            return 0;
        }
        return 1 + divisionRecursiva (divisor - dividendo, dividendo);
    }
}
