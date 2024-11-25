import java.util.Scanner;

public class NegativoPositivoZero {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);

        System.out.println("Descobrir se um número é positivo, negativo ou zero");
        System.out.println("Entre com um número: ");
        numero = in.nextInt();

        if (numero > 0) {
            System.out.println(numero + " é positivo.");
        } else if (numero<0) {
            System.out.println(numero + " é negativo.");
        } else {
            System.out.println(numero + " é igual a zero.");
        }
    }
}
