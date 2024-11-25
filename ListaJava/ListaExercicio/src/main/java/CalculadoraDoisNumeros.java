import java.util.Scanner;

public class CalculadoraDoisNumeros {
    public static void main(String[] args) {
        int valor1, valor2, resultado;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        valor1 = in.nextInt();
        System.out.println("Entre com o segundo valor: ");
        valor2 = in.nextInt();

        resultado = valor1 + valor2;
        System.out.println("Resultado da soma de " + valor1 + " + " + valor2 + " é: "+ resultado +".");
        resultado = valor1 - valor2;
        System.out.println("Resultado da subtração de " + valor1 + " - " + valor2 + " é: "+ resultado +".");
        resultado = valor1 * valor2;
        System.out.println("Resultado da multiplicação de " + valor1 + " * " + valor2 + " é: "+ resultado +".");
        resultado = valor1 / valor2;
        System.out.println("Resultado da divisão de " + valor1 + " / " + valor2 + " é: "+ resultado +".");

    }
}
