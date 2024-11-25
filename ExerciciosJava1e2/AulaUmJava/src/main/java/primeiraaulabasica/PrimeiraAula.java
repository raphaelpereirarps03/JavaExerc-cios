package primeiraaulabasica;
import java.util.Scanner;
public class PrimeiraAula {
    public static void main (String [] args) {
        int numero1 = 0, numero2 = 0, numero3 =0, soma=0;

        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor:");
        numero1 = in.nextInt();
        System.out.println("Entre com o segundo valor: ");
        numero2 = in.nextInt();
        soma = numero1 + numero2;
        System.out.println("A soma de ambos é: " + soma);
    }
}
