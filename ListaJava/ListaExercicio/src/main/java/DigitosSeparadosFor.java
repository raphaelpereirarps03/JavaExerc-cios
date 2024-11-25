import java.util.Scanner;

public class DigitosSeparadosFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = in.nextInt();

        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.print(numeroStr.charAt(i) + (i < numeroStr.length() - 1 ? ", " : ""));
        }

        in.close();
    }
}
