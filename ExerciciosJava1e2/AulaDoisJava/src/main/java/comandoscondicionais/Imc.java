package comandoscondicionais;
import java.util.Scanner;
public class Imc {
    public static void main (String [] args) {
        float altura, peso, imc;
        altura = peso = imc = 0;
        Scanner in = new Scanner (System.in);

        System.out.println("Vamos calcular seu imc?");
        System.out.println("Entre com a sua altura: ");
        altura = in.nextFloat();
        System.out.println("Entre com o seu peso: ");
        peso = in.nextFloat();

        imc = peso / (altura * altura);

        System.out.printf("Seu imc é igual à: %.2f", imc ,".");

        if (imc< 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc > 18.5 && imc <= 24.9 ) {
            System.out.println("Você está no peso ideal. Parabéns :)");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc > 29.9 && imc <=34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("Obesidade grau 2 (Severa)");
        } else {
            System.out.println("Obesidade grau 3 (Mórbida)");
        }

        in.close();
    }

}
