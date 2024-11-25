public class Fibonacci20For {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, temp;

        System.out.print("Primeiros 20 números da sequência de Fibonacci: " + num1 + ", " + num2);

        for (int i = 3; i <= 20; i++) {
            temp = num1 + num2;
            System.out.print(", " + temp);
            num1 = num2;
            num2 = temp;
        }

        System.out.println();
    }
}
