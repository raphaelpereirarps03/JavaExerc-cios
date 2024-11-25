import java.util.Scanner;

public class Matriz3x3ProdutoDiagonalSecundaria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produtoDiagonalSecundaria = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            produtoDiagonalSecundaria *= matriz[i][2 - i];
        }

        System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonalSecundaria);

        in.close();
    }
}
