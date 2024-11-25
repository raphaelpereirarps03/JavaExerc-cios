import java.util.Scanner;

public class MediaIdadesDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int somaIdades = 0, contador = 0, idade;
        String nome;

        do {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            nome = in.nextLine();
            System.out.print("Digite a idade de " + nome + ": ");
            idade = in.nextInt();
            in.nextLine();

            somaIdades += idade;
            contador++;
        } while (contador < 5);

        double media = (double) somaIdades / 5;
        System.out.printf("A média das idades é: %.2f\n", media);

        in.close();
    }
}
