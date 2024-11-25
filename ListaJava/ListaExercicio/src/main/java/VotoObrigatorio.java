import java.util.Scanner;
public class VotoObrigatorio {
    public static void main(String[] args) {
        int idade;
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos descobrir sua situação de voto: ");
        System.out.println("Entre com a sua idade: ");
        idade = in.nextInt();

        if (idade<16) {
            System.out.println("Você ainda não pode votar!");
        } else if (idade>=18 && idade<70) {
            System.out.println("Seu voto é obrigatório!");
        } else {
            System.out.println("Seu voto é opcional!");
        }
    }

}
