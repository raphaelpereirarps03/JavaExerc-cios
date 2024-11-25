import java.util.Scanner;

public class MaiorEMenorValorVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior, menor;

        System.out.print("Digite o 1º número: ");
        numeros[0] = in.nextInt();
        maior = menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);

        in.close();
    }
}
