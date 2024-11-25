import java.util.Scanner;

public class SomaParesFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, soma = 0;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);

        in.close();
    }
}
