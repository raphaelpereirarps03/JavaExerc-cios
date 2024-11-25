import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class OrdemDecrescente5NumerosVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] numeros = new Integer[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.print("Números em ordem decrescente: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + (i < 4 ? ", " : ""));
        }

        in.close();
    }
}
