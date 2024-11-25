import java.util.Scanner;
public class DivisoresDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, divisor = 1;

        System.out.print("Digite um número inteiro positivo: ");
        numero = in.nextInt();

        System.out.print("Divisores de " + numero + ": ");
        do {
            if (numero % divisor == 0) {
                System.out.print(divisor + (divisor < numero ? ", " : ""));
            }
            divisor++;
        } while (divisor <= numero);

        in.close();
    }

}
