import java.util.Scanner;

public class FatorialFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, fatorial = 1;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        in.close();
    }
}
