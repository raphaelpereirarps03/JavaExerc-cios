import java.util.Scanner;

public class MediaIdadesFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            in.nextLine(); // Lê o nome, mas não faz nada com ele
            System.out.print("Digite a idade da pessoa " + i + ": ");
            somaIdades += in.nextInt();
        }

        double media = somaIdades / 5.0;
        System.out.println("A média das idades é: " + media);

        in.close();
    }
}
