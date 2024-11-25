package comandoscondicionais;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int valor = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos descobrir se um número é impar ou par? ");
        System.out.println("Entre com um valor para descobrir se o mesmo é impar ou par: ");
        valor = in.nextInt();

        if (valor % 2 ==0 ) {
            System.out.println(valor + "é par.");
        } else {
            System.out.println( valor +"é ímpar.");
        }

    }
}
