import java.util.Scanner;
public class ConversorIdade {
    public static void main(String[] args) {
        int anos, meses, dias, diasVida;
        Scanner in = new Scanner(System.in);

        System.out.println("Converter sua idade em dias meses e anos: ");
        System.out.println("Vamos por partes. Quantos anos você tem?");
        anos = in.nextInt();
        System.out.println("Quantos meses?");
        meses = in.nextInt();
        System.out.println("E dias?");
        dias = in.nextInt();

        diasVida = (anos * 365) + (meses * 31) + dias;

        System.out.println("Sua idade normal: " + anos + " anos, "+ meses + " meses e " + dias + " dias.");
        System.out.println("Que é igual à: " + diasVida);
    }
}
