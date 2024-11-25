import java.util.Scanner;

public class QTDDiasMes {
    public static void main(String[] args) {
        String mes;
        String qtdDias;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o número de um mês: ");
        mes = in.nextLine();

        switch (mes) {
            case "Janeiro": qtdDias = "31 dias";
                break;
            case "Fevereiro": qtdDias = "28 dias (ou 29 dias em anos bissextos)";
                break;
            case "Março": qtdDias = "31 dias";
                break;
            case "Abril": qtdDias = "30 dias";
                break;
            case "Maio": qtdDias = "31 dias";
                break;
            case "Junho": qtdDias = "30 dias";
                break;
            case "Julho": qtdDias = "31 dias";
                break;
            case "Agosto": qtdDias = "31 dias";
                break;
            case "Setembro": qtdDias = "30 dias";
                break;
            case "Outubro": qtdDias = "31 dias";
                break;
            case "Novembro": qtdDias = "30 dias";
                break;
            case "Dezembro": qtdDias = "31 dias";
                break;
            default: qtdDias = "O mês informado é inválido, tente novamente.";
        }

        System.out.println(mes + ": "+  qtdDias);
    }
}
