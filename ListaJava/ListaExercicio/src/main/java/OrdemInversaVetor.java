import java.util.Scanner;

public class OrdemInversaVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
        }

        System.out.print("Números na ordem inversa: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + (i > 0 ? ", " : ""));
        }

        in.close();
    }
}
