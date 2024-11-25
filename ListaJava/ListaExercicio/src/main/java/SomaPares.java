import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, soma = 0, contador = 1;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        while (contador <= numero) {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);
        in.close();
    }
}
