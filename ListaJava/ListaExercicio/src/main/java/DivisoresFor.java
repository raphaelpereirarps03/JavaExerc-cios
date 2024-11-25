import java.util.Scanner;

public class DivisoresFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = in.nextInt();

        System.out.print("Divisores de " + numero + ": ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + (i < numero ? ", " : ""));
            }
        }

        in.close();
    }
}
