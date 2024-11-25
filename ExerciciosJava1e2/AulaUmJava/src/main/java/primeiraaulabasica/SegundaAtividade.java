package primeiraaulabasica;
import java.util.Scanner;

public class SegundaAtividade {
    public static void main (String [] args) {
        int nota1, nota2, nota3, nota4, media;
        nota1 = nota2 = nota3 = nota4 = media = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Entre com a 1ª nota: ");
        nota1 = in.nextInt();

        System.out.println("Entre com a 2ª nota: ");
        nota2 = in.nextInt();

        System.out.println("Entre com a 3ª nota: ");
        nota3 = in.nextInt();

        System.out.println("Entre com a 4ª nota: ");
        nota4 = in.nextInt();

        media = ((nota1 + nota2 + nota3 + nota4)/4 );

        System.out.println("A média de notas é: " + media);
    }

}
