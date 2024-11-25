import java.util.Scanner;
public class NumeroPrimoWhile {
    public static void main(String[] args) {
        int numero, i = 1, qtdDivisores = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos descobrir se um número é primo ou não");
        System.out.println("Entre com um número: ");
        numero = in.nextInt();
        i = numero;
        while (i > 0) {
            if (numero%i == 0) {
                qtdDivisores++;
            }

            i++;
        }
        if (qtdDivisores<=2) {
            System.out.println( numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }

        in.close();
    }
}
