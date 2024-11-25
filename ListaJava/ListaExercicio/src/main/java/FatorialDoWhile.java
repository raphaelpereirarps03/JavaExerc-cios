import java.util.Scanner;

public class FatorialDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, fatorial = 1, i;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();
        i = numero;

        do {
            fatorial *= i;
            i--;
        } while (i >= 1);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        in.close();
    }
}
