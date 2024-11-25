import java.util.Scanner;

public class MenoresMaiores {
    public static void main(String[] args) {
        int qtdMaiores, qtdMenores, idade, pessoas, i;
        qtdMaiores = qtdMenores = idade = pessoas = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos são maiores e quantos são menores?");
        System.out.println("Quantas pessoas serão analisadas?");
        pessoas = in.nextInt();

        for (i = 1; i <= pessoas ; i++) {
            System.out.println("Entre com a idade da " +i+ "º pessoa");
            idade = in.nextInt();
            if (idade > 18) {
                qtdMaiores++;
            } else {
                qtdMenores++;
            }
        }
        System.out.println("Quantidade de pessoas maiores: " + qtdMaiores);
        System.out.println("Quantidade de pessoas menores: " + qtdMenores);
    }
}
