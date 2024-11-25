import java.util.Scanner;
public class DivisoresNumero {
    public static void main(String[] args) {
        int numero, i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos descobrir todos os divisores de um número");
        System.out.println("Entre com um número: ");
        numero = in.nextInt();

        while (i <= numero) {
            if (numero%i == 0) {
                System.out.println(i + " é divisor de " + numero);
            }

            i++;
        }
    }
}
