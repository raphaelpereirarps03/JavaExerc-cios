import java.util.Scanner;

public class DigitosSeparados {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, digito;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        System.out.print("Dígitos separados: ");
        while (numero > 0) {
            digito = numero % 10;
            numero /= 10;
            System.out.print(digito + (numero > 0 ? ", " : ""));
        }

        in.close();
    }
}
