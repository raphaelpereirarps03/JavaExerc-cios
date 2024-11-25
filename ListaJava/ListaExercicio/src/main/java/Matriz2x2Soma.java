import java.util.Scanner;

public class Matriz2x2Soma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] somaMatrizes = new int[2][2];

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
                somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("A soma das duas matrizes é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(somaMatrizes[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
