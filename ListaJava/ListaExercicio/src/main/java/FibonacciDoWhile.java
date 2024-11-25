import java.util.Scanner;
public class FibonacciDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, num1 = 0, num2 = 1, temp;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        System.out.print("Sequência de Fibonacci: " + num1);
        if (numero >= 1) {
            System.out.print(", " + num2);
        }

        do {
            temp = num1 + num2;
            if (temp > numero) {
                break;
            }
            System.out.print(", " + temp);
            num1 = num2;
            num2 = temp;
        } while (temp <= numero);

        System.out.println();
        in.close();
    }
}
