import java.util.Scanner;

public class Matriz3x3Exibir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
