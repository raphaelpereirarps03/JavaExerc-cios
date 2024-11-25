import java.util.Scanner;

public class SomaPositivosENegativos10NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPositivos = 0, somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            if (numeros[i] > 0) {
                somaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                somaNegativos += numeros[i];
            }
        }

        System.out.println("A soma dos valores positivos é: " + somaPositivos);
        System.out.println("A soma dos valores negativos é: " + somaNegativos);

        in.close();
    }
}
