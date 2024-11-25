import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, contador = 1;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        do {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        } while (contador <= 10);

        in.close();
    }
}
