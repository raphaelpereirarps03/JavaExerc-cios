import java.util.Scanner;

public class Matriz4x4SomaColunas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos de cada coluna:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }

        in.close();
    }
}
