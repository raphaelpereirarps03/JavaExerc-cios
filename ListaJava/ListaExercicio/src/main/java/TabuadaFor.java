import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        in.close();
    }
}
