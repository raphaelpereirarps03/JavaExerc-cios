package comandoscondicionais;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o valor A: ");
        a = in.nextInt();
        System.out.println("Entre com o valor B: ");
        b = in.nextInt();

        if (a>b) {
            System.out.println("O maior valor é o A ("+ a +").");
        } else if (a==b) {
            System.out.println("Não existe maior pois ambos são iguais. ("+ a +").");
        } else {
            System.out.println("O maior valor é o B ("+ b +")");
        }

        in.close();

    }
}
