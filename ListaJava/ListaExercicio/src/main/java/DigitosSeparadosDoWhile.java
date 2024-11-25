import java.util.Scanner;

public class DigitosSeparadosDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, digito;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        System.out.print("Dígitos separados: ");
        do {
            digito = numero % 10;
            numero /= 10;
            System.out.print(digito + (numero > 0 ? ", " : ""));
        } while (numero > 0);

        in.close();
    }
}
