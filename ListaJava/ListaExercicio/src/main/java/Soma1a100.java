public class Soma1a100 {
    public static void main(String[] args) {
        int numero = 1, soma = 0;

        do {
            soma += numero;
            numero++;
        } while (numero <= 100);

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
