import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        int idade, sexo;
        Scanner in = new Scanner (System.in);

        System.out.println("Vamos descobrir se você pode ou não se aposentar");
        System.out.println("Entre com a sua idade: ");
        idade = in.nextInt();
        System.out.println("Entre com o seu sexo biológico: \n OBS: \n 1 - Masculino; \n 2 - Feminino");
        sexo = in.nextInt();

        switch (sexo) {
            case 1:
                if (idade>=65) {
                    System.out.println("Sexo: Masc.; Idade:" + idade + ". Parabéns, você pode se aposentar!");
                } else {
                    System.out.println("Sexo: Masc.; Idade:" + idade + ". Você ainda não pode se aposentar!");
                }
                break;
            case 2:
                if (idade>=60) {
                    System.out.println("Sexo: Fem.; Idade:" + idade + ". Parabéns, você pode se aposentar!");
                } else {
                    System.out.println("Sexo: Fem.; Idade:" + idade + ". Você ainda não pode se aposentar!");
                }
                break;
            default:
                System.out.println("Opção inválida, tente novamente. Lembrando: \n 1 - Masculino; \n 2 - Feminino");
        }


        in.close();
    }
}
