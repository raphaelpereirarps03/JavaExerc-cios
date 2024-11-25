import java.util.Scanner;
public class MediaCincoValores {
    public static void main(String[] args) {
        float soma, nota, media, i = 1;
        Scanner in = new Scanner(System.in);
        media = nota = soma = 0;

        System.out.println("Vamos tirar a média de 5 valores usando while?");

        while (i < 6) {
            System.out.println("Entre com a " + i + "ª nota: ");
            nota = in.nextFloat();
            soma = soma + nota;
            i++;
        }

        media = soma / 5;

        System.out.printf("Média: %.2f" , media);

        in.close();
    }
}
