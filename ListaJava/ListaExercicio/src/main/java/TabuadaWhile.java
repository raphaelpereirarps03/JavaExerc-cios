import java.util.Scanner;
public class TabuadaWhile {
    public static void main(String[] args) {
        int n, i = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Exibir a tabuada de um determinado número usando while");
        System.out.println("Entre com um número: ");
        n = in.nextInt();
        System.out.println("Tabuada do " + n);
        while (i<11) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }

        in.close();

    }
}
