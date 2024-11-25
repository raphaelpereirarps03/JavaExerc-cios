import java.util.Scanner;

public class NumeroPrimoFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, contador = 0;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        in.close();
    }
}
