import java.util.Scanner;
public class qtdSalario {
    public static void main(String[] args) {
        double salario, qtdSalarios;
        Scanner in = new Scanner (System.in);

        System.out.println("Vamos descobrir quantos salários voc");
        System.out.println("Entre com o seu salário: ");
        salario = in.nextDouble();
        qtdSalarios = salario / 1412;
        System.out.printf("Você recebe aproximandamente: %.1f",qtdSalarios);
        in.close();

    }
}
