package comandoscondicionais;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int farol;
        String mensagem;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com um valor para o farol: (1 - Verde; 2 - Amarelo; 3 - Vermelho.)");
        farol = in.nextInt();

        switch (farol) {
            case 1: mensagem = "Farol verde! Siga!";
            break;
            case 2: mensagem = "Farol amarelo! Atenção, reduza a velocidade!";
            break;
            case 3: mensagem = "Farol vermelho! Pare!";
            break;
            default:mensagem = "Número inválido, tente novamente.";
        }

        System.out.println(mensagem);
    }


}
