import java.util.Scanner;

public class AumentoSalarioIf {
    public static void main(String[] args) {
        double salariobase, salariofinal;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculo de salário sobre comissão");
        System.out.println("Entre com o salário base: ");
        salariobase = in.nextDouble();

        System.out.printf("Salário base: R$%.2f\n" , salariobase );
        if (salariobase > 2000) {
            salariofinal = salariobase + ((salariobase * 15)/100);
            System.out.println("O valor do bônus é: R$" + ((salariobase * 15)/100));
        } else {
            salariofinal = salariobase + ((salariobase * 5)/100);
            System.out.println("O valor do bônus é: R$" + ((salariobase * 5)/100));
        }


        System.out.println("O salário líquido é: R$" + salariofinal );
    }
}
