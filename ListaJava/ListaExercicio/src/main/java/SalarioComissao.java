import java.util.Scanner;
public class SalarioComissao {
    public static void main(String[] args) {
        double salariobase, salariofinal;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculo de salário sobre comissão");
        System.out.println("Entre com o salário base: ");
        salariobase = in.nextDouble();

        salariofinal = salariobase + ((salariobase * 5)/100);

        System.out.println("O salário líquido é: R$" + salariofinal );
    }
}
