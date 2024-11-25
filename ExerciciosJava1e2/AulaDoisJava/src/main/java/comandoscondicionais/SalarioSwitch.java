package comandoscondicionais;
import java.util.Scanner;

public class SalarioSwitch {
    public static void main(String[] args) {
        int cargo;
        double salario, aumento;
        String mensagem;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o respectivo código do seu cargo para saber seu salário pós ajuste: ");
        System.out.println("1 - Programador Estagiário: R$1.400,00: \n2 - Programador Junior: R$ 3.000,00; \n3 - Programador Pleno: R$5.500; \n4 - Programador Senior: R$8.000,00; \n5 - Programador Master: 12.000,00");
        cargo = in.nextInt();

        switch (cargo) {
            case 1 :
                aumento = (1400 * 10)/100;
                salario = 1400 + aumento;
                mensagem = "Programador Estagiário";
                break;
            case 2 :
                aumento = (3000 * 12)/100;
                salario = 3000 + aumento;
                mensagem = "Programador Junior";
                break;
            case 3 :
                aumento = (5500 * 13)/100;
                salario = 5500 + aumento;
                mensagem = "Programador Pleno";
                break;
            case 4 :
                aumento = (8000 * 15)/100;
                salario = 8000 + aumento;
                mensagem = "Programador Senior";
                break;
            case 5 :
                aumento = (12000 * 18)/100;
                salario = 12000 + aumento;
                mensagem = "Programador Master";
                break;
            default:
                aumento = 0;
                salario = 0;
                mensagem = "Cargo fornecido inválido, tente novamente.";
        }

        System.out.println("Seu cargo: " + mensagem + "; Salário pós ajuste: " + salario + ".");


    }
}
