import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        int numero, i;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculando tabuada até o 10º termo de um número fornecido");
        System.out.println("Entre com um número: ");
        numero = in.nextInt();

        for (i = 0; i<=10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
    }
}
