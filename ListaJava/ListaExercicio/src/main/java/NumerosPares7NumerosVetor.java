import java.util.Scanner;

public class NumerosPares7NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
        }

        System.out.print("Números pares: ");
        for (int i = 0; i < 7; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + (i < 6 ? ", " : ""));
            }
        }

        in.close();
    }
}
