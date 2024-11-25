import java.util.Scanner;
public class VendaMaca {
    public static void main(String[] args) {
        int qtdMaca;
        double valorTotal;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculo do valor total a ser pago na venda de maçãs");
        System.out.println("Entre com a qtd de maçãs compradas: ");
        qtdMaca= in.nextInt();


        if (qtdMaca > 12) {
            valorTotal =  0.40 * qtdMaca;
        } else {
            valorTotal =  0.50 * qtdMaca;
        }

        System.out.println("Quantidade de Maçãs: " + qtdMaca + ". O valor total a ser pago é: R$" + valorTotal);
    }

}
