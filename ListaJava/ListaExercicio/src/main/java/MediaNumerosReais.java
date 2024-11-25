import java.util.Scanner;
public class MediaNumerosReais {
    public static void main(String[] args) {
        double valor1, valor2, valor3, media;
        Scanner in = new Scanner(System.in);

        System.out.println("Programa que calcula a média aritmética entre três números reais inseridos pelo usuário.");
        System.out.println("Entre com o primeiro valor: ");
        valor1 = in.nextDouble();
        System.out.println("Entre com o segundo valor: ");
        valor2 = in.nextDouble();
        System.out.println("Entre com o terceiro valor: ");
        valor3 = in.nextDouble();

        media = (valor1 + valor2 + valor3)/3;

        System.out.println("Média aritmética entre "+valor1+", " +valor2+ " e " +valor3+ " é " +media+ ".");

    }
}
