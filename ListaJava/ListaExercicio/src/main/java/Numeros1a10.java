public class Numeros1a10 {
    public static void main(String[] args) {
        int numero = 1;

        do {
            System.out.print(numero + (numero < 10 ? ", " : ""));
            numero++;
        } while (numero <= 10);
    }
}
