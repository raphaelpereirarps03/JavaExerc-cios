package comandoscondicionais;

import java.util.Scanner;
public class Credito {
    public static void main (String [] args) {
        float salario1, salario2, salario3, salario4, salario5, salario6, media, credito;
        salario1 = salario2 = salario3 = salario4 = salario5 = salario6 = credito = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Crédtio do salário médio.");



        System.out.println("Entre com o 1º salário: ");
        salario1 = in.nextFloat();

        System.out.println("Entre com o 1º salário: ");
        salario1 = in.nextFloat();

        System.out.println("Entre com o 2º salário: ");
        salario2 = in.nextFloat();

        System.out.println("Entre com o 3º salário: ");
        salario3 = in.nextFloat();

        System.out.println("Entre com o 4º salário: ");
        salario4 = in.nextFloat();

        System.out.println("Entre com o 5º salário: ");
        salario5 = in.nextFloat();

        System.out.println("Entre com o 6º salário: ");
        salario6 = in.nextFloat();

        media = (salario1 + salario2 + salario3 + salario4 + salario5 + salario6) / 6;

        if (media > 0 && media <= 500) {
            System.out.println("Nenhum crédito.");
        } else if (media >= 501 && media <= 1000) {
            credito = (media * 30) / 100;
            System.out.printf("30% do valor do saldo médio, ou seja: R$",credito, " de crédito.");

        } else if (media >= 1001 && media <= 3000) {
            credito = (media * 40) / 100;
            System.out.printf("40% do valor do saldo médio, ou seja: R$",credito, " de crédito.");
        } else {
            credito = (media * 50) / 100;
            System.out.printf("50% do valor do saldo médio, ou seja: R$",credito, " de crédito.");
        }


    }
}
