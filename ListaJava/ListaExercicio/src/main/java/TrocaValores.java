import java.util.Scanner;
public class TrocaValores {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Troca de valores. Exibir A em B e B em A");
        System.out.println("Entre com o valor de A: ");
        a = in.nextInt();
        System.out.println("A = " + a);
        System.out.println("Entre com o valor de B: ");
        b = in.nextInt();
        System.out.println("B = " + b);
        System.out.println("---------- TROCANDO ----------");
        c = a;
        a = b;
        b = c;
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}
