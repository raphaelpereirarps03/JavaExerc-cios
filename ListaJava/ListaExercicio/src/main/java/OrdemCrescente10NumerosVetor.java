import java.util.Scanner;
import java.util.Arrays;

public class OrdemCrescente10NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
        }

        Arrays.sort(numeros);

        System.out.print("Números em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + (i < 9 ? ", " : ""));
        }

        in.close();
    }
}
