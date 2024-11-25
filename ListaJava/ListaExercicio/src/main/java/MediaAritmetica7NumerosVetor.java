import java.util.Scanner;

public class MediaAritmetica7NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[7];
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            soma += numeros[i];
        }

        double media = soma / 7.0;
        System.out.println("A média aritmética dos números é: " + media);

        in.close();
    }
}
