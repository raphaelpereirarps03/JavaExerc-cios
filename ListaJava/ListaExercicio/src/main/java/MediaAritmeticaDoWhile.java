import java.util.Scanner;

public class MediaAritmeticaDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0, contador = 0, numero;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = in.nextInt();
            soma += numero;
            contador++;
        } while (contador < 5);

        double media = (double) soma / 5;
        System.out.println("A média aritmética dos valores lidos é: " + media);

        in.close();
    }
}
