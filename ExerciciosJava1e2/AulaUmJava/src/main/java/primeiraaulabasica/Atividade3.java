package primeiraaulabasica;
import java.util.Scanner;

public class Atividade3 {
    public static void main (String [] args) {
        int numero, i;
        numero = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o valor de um número que vc deseja saber sua tabuada: ");
        numero = in.nextInt();

        System.out.println("A tabuado do " + numero + ", até 10 é: ");
        for(i = 1; i<=10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }

}
