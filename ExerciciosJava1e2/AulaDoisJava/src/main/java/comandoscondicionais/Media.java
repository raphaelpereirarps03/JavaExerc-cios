package comandoscondicionais;
import java.util.Scanner;

public class Media {
    public static void main (String [] args) {
        float n1, n2, n3, n4, media;

        Scanner in = new Scanner(System.in);


        System.out.println("Entre com a primeira nota: ");
        n1 = in.nextFloat();

        System.out.println("Entre com a segunda nota: ");
        n2 = in.nextFloat();

        System.out.println("Entre com a terceira nota: ");
        n3 = in.nextFloat();

        System.out.println("Entre com a quarta nota: ");
        n4 = in.nextFloat();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.printf("A média é: %.2f" , media , ".");
        System.out.println("");
        if (media >=7 ) {
            System.out.println("Você está aprovado! Meus Parabéns. :)");
        } else if (media >= 5) {
            System.out.println("Você está de recuparação! 2ª chance! :)");
        } else {
            System.out.println("Você foi reprovado! Tente novamente!");
        }
    }



}
