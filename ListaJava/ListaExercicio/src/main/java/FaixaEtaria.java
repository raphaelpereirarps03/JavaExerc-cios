import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        int idade;
        Scanner in = new Scanner(System.in);

        System.out.println("Descobrir se você é uma criança, um adolescente,adulto ou idoso");
        System.out.println("Entre com a sua idade: ");
        idade = in.nextInt();

        if (idade < 14) {
            System.out.println("Sua idade: " + idade + ", você é uma criança!.");
        } else if (idade < 18){
            System.out.println("Sua idade: " + idade + ", você é um adolescente!.");
        } else if (idade < 60) {
            System.out.println("Sua idade: " + idade + ", você é um adulto!.");
        } else {
            System.out.println("Sua idade: " + idade + ", você é um idoso!.");
        }
    }
}
