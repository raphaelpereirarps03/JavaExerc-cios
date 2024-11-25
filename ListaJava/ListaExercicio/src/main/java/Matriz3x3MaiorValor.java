import java.util.Scanner;

public class Matriz3x3MaiorValor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor presente na matriz é: " + maiorValor);

        in.close();
    }
}
