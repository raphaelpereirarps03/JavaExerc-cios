import java.util.Scanner;

public class Aprovacao {
    public static void main (String [] args) {
        float n1, n2, n3, media;

        Scanner in = new Scanner(System.in);


        System.out.println("Entre com a primeira nota: ");
        n1 = in.nextFloat();

        System.out.println("Entre com a segunda nota: ");
        n2 = in.nextFloat();

        System.out.println("Entre com a terceira nota: ");
        n3 = in.nextFloat();

        media = (n1 + n2 + n3 )/3;

        System.out.printf("A média é: %.2f" , media , ".");
        System.out.println("");
        if (media >=7 ) {
            System.out.println("Você está aprovado! Meus Parabéns. :)");
        } else {
            System.out.println("Você foi reprovado! Tente novamente!");
        }
    }
}
