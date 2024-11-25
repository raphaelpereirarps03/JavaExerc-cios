import java.util.Scanner;

public class MediaParesEImparesVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0, contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = in.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contadorPares++;
            } else {
                somaImpares += numeros[i];
                contadorImpares++;
            }
        }

        if (contadorPares > 0) {
            double mediaPares = (double) somaPares / contadorPares;
            System.out.println("A média dos números pares é: " + mediaPares);
        } else {
            System.out.println("Não foram digitados números pares.");
        }

        if (contadorImpares > 0) {
            double mediaImpares = (double) somaImpares / contadorImpares;
            System.out.println("A média dos números ímpares é: " + mediaImpares);
        } else {
            System.out.println("Não foram digitados números ímpares.");
        }

        in.close();
    }
}
