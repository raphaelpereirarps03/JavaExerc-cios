import java.util.Scanner;

public class FaltaDisciplina {
    public static void main(String[] args) {
        int faltas;
        Scanner in = new Scanner(System.in);

        System.out.println("Aprovado ou reprovado?");
        System.out.println("Entre com o número de faltas do aluno: ");
        faltas = in.nextInt();

        if (faltas > 15) {
            System.out.println("Aluno reprovado por falta. ");
        } else {
            System.out.println("Aluno aprovado... por enquanto.");
        }
        in.close();
    }
}
