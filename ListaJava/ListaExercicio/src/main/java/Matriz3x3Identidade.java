import java.util.Scanner;

public class Matriz3x3Identidade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    identidade = false;
                    break;
                }
            }
            if (!identidade) {
                break;
            }
        }

        if (identidade) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz não é identidade.");
        }

        in.close();
    }
}
