import java.util.Scanner;

public class QuantidadeParesVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("A quantidade de números pares é: " + quantidadePares);

        in.close();
    }
}
