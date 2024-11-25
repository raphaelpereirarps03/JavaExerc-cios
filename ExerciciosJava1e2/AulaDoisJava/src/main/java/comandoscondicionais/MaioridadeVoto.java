package comandoscondicionais;
import java.util.Scanner;
public class MaioridadeVoto {
    public static void main (String [] args) {
        int idade;

        Scanner in = new Scanner(System.in);
        System.out.println("Entre com a sua idade: ");
        idade = in.nextInt();

        if (idade >= 18 && idade <= 69) {
            System.out.println("Seu voto é obrigatório!");
        } else if (idade >= 16 || idade > 69) {
            System.out.println("Seu voto é opcional!");
        } else {
            System.out.println("Você não pode votar");
        }
        in.close();
    }
}
