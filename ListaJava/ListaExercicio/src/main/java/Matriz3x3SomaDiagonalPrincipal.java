import java.util.Scanner;

public class Matriz3x3SomaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);

        in.close();
    }
}
