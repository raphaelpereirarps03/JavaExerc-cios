import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, fatorial = 1, contador;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();
        contador = numero;

        while (contador > 1) {
            fatorial *= contador;
            contador--;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        in.close();
    }
}
