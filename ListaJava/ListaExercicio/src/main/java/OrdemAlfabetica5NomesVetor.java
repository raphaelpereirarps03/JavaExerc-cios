import java.util.Scanner;
import java.util.Arrays;

public class OrdemAlfabetica5NomesVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = in.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        in.close();
    }
}
