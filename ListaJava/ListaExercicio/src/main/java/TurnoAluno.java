import java.util.Scanner;

public class TurnoAluno {
    public static void main (String [] args) {
        String nome, turno;

        Scanner in = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        nome = in.next();
        System.out.println("Entre com seu turno: \n OBS: \n 1 - M (Manhã) \n 2 - V (Vespertino)");
        turno = in.next();

        switch (turno) {
            case "M":
                System.out.println("Bom dia, " + nome);
                break;
            case "V":
                System.out.println("Boa tarde, " + nome);
                break;
            default:
                System.out.println("Turno inválido");
                break;
        }

        in.close();
    }
}
