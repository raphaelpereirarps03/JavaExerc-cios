import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0, somaIdades = 0, idade;
        String nome;
        double media;


        while (contador < 5) {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            nome = in.next();

            System.out.print("Digite a idade de " + nome + ": ");
            idade = in.nextInt();

            somaIdades += idade;
            contador++;
        }

        media = (double) somaIdades / 5;
        System.out.printf("A média das idades é: %.2f\n", media);

        in.close();
    }
}
