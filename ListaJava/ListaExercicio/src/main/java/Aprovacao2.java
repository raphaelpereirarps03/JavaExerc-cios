import java.util.Scanner;

public class Aprovacao2 {
    public static void main (String [] args) {
        float n1;
        String nome;

        Scanner in = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        nome = in.next();
        System.out.println("Entre com a primeira nota: ");
        n1 = in.nextFloat();


        if (n1 >=7 ) {
            System.out.println(nome + ", você está aprovado! Meus Parabéns. :)");
        } else {
            System.out.println(nome + ", você foi reprovado! Tente novamente!");
        }
    }
}
