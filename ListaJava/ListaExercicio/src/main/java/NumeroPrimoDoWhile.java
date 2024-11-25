import java.util.Scanner;

public class NumeroPrimoDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, divisor = 2;
        boolean primo = true;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        if (numero <= 1) {
            primo = false;
        } else {
            do {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
                divisor++;
            } while (divisor <= Math.sqrt(numero));
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        in.close();
    }
}
