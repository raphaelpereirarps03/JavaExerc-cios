import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);

        System.out.println("Descobrir se um número é impar ou par");
        System.out.println("Entre com um número: ");
        numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}
