import java.util.Scanner;

public class QuantosNoIntervalo10a50Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        int countNoIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                countNoIntervalo++;
            }
        }

        System.out.println("A quantidade de números no intervalo de 10 a 50 é: " + countNoIntervalo);

        in.close();
    }
}
