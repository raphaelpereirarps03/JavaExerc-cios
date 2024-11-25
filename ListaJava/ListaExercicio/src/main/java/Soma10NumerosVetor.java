import java.util.Scanner;

public class Soma10NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);

        in.close();
    }
}
