import java.util.Scanner;

public class MediaAritmeticaFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            soma += in.nextInt();
        }

        double media = soma / 5.0;
        System.out.println("A média aritmética dos valores lidos é: " + media);

        in.close();
    }
}
