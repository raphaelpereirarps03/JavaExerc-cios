import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {
        int nota1 ,nota2, nota3;
        double media;
        Scanner in = new Scanner (System.in);

        System.out.println("Calculo de Média de Notas");
        System.out.println("Entre com a nota1: ");
        nota1 = in.nextInt();
        System.out.println("Entre com a nota2: ");
        nota2 = in.nextInt();
        System.out.println("Entre com a nota3: ");
        nota3 = in.nextInt();

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2.00 + 3.00 + 5.00);

        System.out.println("A média ponderada é: "+ media);

    }
}
