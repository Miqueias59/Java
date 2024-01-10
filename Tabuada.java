import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + numero * i);
            i++;
        }

        for (int j = 2; j <= 9; j++) {
            System.out.println("\nTabuada do " + j + ":");
            for (int k = 1; k <= 10; k++) {
                System.out.println(j + " x " + k + " = " + j * k);
            }
        }
    }
}