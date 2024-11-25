import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        int a, b, c, maior, meio, menor;
        Scanner in = new Scanner(System.in);

        System.out.println("Ordem Crescente: ");
        System.out.println("Entre com o primeiro valor:");
        a = in.nextInt();
        System.out.println("Entre com o segundo valor: ");
        b = in.nextInt();
        System.out.println("Entre com o terceiro valor: ");
        c = in.nextInt();

        if (a>b && a>c) {
            maior = a;
        } else if (b>a && b>c) {
            maior = b;
        } else {
            maior = c;
        }

        if (a<b && a<c) {
            menor = a;
        } else if (b<a && b<c) {
            menor = b;
        } else {
            menor = c;
        }

        if (a > menor && a < maior) {
            meio = a;
        } else if (b > menor && b < maior) {
            meio = b;
        } else {
            meio = c;
        }

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
    }
}
