import java.util.Scanner;

public class Matriz2x2SomaElementos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma de todos os elementos da matriz é: " + soma);

        in.close();
    }
}
