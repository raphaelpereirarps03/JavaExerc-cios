package comandoscondicionais;
import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        int mes;
        String mensagem;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o número de um mês: ");
        mes = in.nextInt();

        switch (mes) {
            case 1: mensagem = "Janeiro";
            break;
            case 2: mensagem = "Fevereiro";
                break;
            case 3: mensagem = "Março";
                break;
            case 4: mensagem = "Abril";
                break;
            case 5: mensagem = "Maio";
                break;
            case 6: mensagem = "Junho";
                break;
            case 7: mensagem = "Julho";
                break;
            case 8: mensagem = "Agosto";
                break;
            case 9: mensagem = "Setembro";
                break;
            case 10: mensagem = "Outubro";
                break;
            case 11: mensagem = "Novembro";
                break;
            case 12: mensagem = "Dezembro";
                break;
            default: mensagem = "O número digitado não corresponde a nenhum mês, tente novamente.";
        }

        System.out.println(mensagem);
    }
}
