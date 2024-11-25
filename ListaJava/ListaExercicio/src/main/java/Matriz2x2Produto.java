import java.util.Scanner;

public class Matriz2x2Produto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] produtoMatrizes = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "] da primeira matriz: ");
                matriz1[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "] da segunda matriz: ");
                matriz2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                produtoMatrizes[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
            }
        }

        System.out.println("O produto das duas matrizes é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produtoMatrizes[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
