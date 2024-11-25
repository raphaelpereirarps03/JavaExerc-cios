import java.util.Scanner;

public class Matriz2x2Subtracao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz1[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        System.out.println("Resultado da subtração entre as duas matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
