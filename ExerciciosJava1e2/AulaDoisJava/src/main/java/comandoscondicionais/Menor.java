package comandoscondicionais;
import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        int valor1, valor2, valor3, menor;
        valor1 = valor2 = valor3 = menor = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Programa para se ler 3 valores e dizer qual é o menor dentre eles.");
        System.out.println("Entre com o 1º valor: ");
        valor1 = in.nextInt();
        menor = valor1;
        System.out.println("Entre com o 2º valor: ");
        valor2 = in.nextInt();
        if (valor2<menor) {
            menor=valor2;
        }
        System.out.println("Entre com o 3º valor: ");
        valor3 = in.nextInt();
        if (valor3<menor) {
            menor=valor3;
        }

        System.out.println("O menor valor é: " + menor + ".");

    }
}
