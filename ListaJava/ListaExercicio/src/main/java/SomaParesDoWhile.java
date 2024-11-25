import java.util.Scanner;

public class SomaParesDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, soma = 0, contador = 2;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        do {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        } while (contador <= numero);

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);
        in.close();
    }
}
