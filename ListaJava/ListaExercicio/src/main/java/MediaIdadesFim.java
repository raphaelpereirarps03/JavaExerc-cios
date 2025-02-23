import java.util.Scanner;

public class MediaIdadesFim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        int idade, somaIdades = 0, contador = 0;

        while (true) {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = in.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("Digite a idade de " + nome + ": ");
            idade = in.nextInt();
            in.nextLine();

            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.printf("A média das idades é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        in.close();
    }
}
