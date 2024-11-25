public class VintePrimeirosFibonacciWhile {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, contador = 0, temp;

        System.out.print("Primeiros 20 números da sequência de Fibonacci: ");
        while (contador < 20) {
            System.out.print(num1 + (contador < 19 ? ", " : ""));
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            contador++;
        }
    }
}
