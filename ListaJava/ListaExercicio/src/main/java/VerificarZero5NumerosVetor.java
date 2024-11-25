import java.util.Scanner;

public class VerificarZero5NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean temZero = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            if (numeros[i] == 0) {
                temZero = true;
            }
        }

        if (temZero) {
            System.out.println("Pelo menos um número é igual a zero.");
        } else {
            System.out.println("Nenhum número é igual a zero.");
        }

        in.close();
    }
}
