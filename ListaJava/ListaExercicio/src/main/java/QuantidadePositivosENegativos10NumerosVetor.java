import java.util.Scanner;

public class QuantidadePositivosENegativos10NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        int quantidadePositivos = 0, quantidadeNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            if (numeros[i] > 0) {
                quantidadePositivos++;
            } else if (numeros[i] < 0) {
                quantidadeNegativos++;
            }
        }

        System.out.println("A quantidade de números positivos é: " + quantidadePositivos);
        System.out.println("A quantidade de números negativos é: " + quantidadeNegativos);

        in.close();
    }
}
