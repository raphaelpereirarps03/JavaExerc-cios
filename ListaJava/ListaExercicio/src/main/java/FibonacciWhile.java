import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        int limite, num1 = 0, num2 = 1, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro para exibir a sequência de Fibonacci até ele: ");
        limite = in.nextInt();
        System.out.print("Sequência de Fibonacci: " + num1);

        while (num2 <= limite) {
            System.out.print(", " + num2);
            temp = num2;
            num2 = num1 + num2;
            num1 = temp;
        }

        System.out.println();
        in.close();
    }
}
