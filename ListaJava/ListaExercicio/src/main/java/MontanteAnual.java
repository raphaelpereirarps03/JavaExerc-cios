import java.util.Scanner;
public class MontanteAnual {
    public static void main(String[] args) {
        int TAMANHO = 12, i;
        double[] poupanca = new double [TAMANHO];
        double montante = 0, taxa;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculo de montante de poupança");
        System.out.println("Entre com a taxa de Juros mensal: ");
        taxa = in.nextDouble();
        for (i = 0; i<TAMANHO ; i++) {
            System.out.println("Entre com o valor depositado na poupança no " + (i+1) + "ª mês: ");
            poupanca[i] = in.nextDouble();
            montante = montante + poupanca[i];
            System.out.println("Montante mês " + (i + 1) + ": " + montante );
            if (i< TAMANHO - 1) {
                montante = montante + (montante * taxa)/100;
                System.out.println("Montante mês " + (i + 1) + " pós taxa: " + montante );
            }

        }


        for (i = 0; i<TAMANHO ; i++) {
            System.out.println("Valor depositado na poupança no " + (i+1) + "ª mês: R$" + poupanca[i] + ".");
        }
        System.out.printf("Com a taxa de %.1f%% ao mês, temos o resultado do montante em: R$%.2f", taxa, montante);


    }
}
