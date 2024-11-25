public class ImparesAteCinquenta {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 50) {
            if (numero % 2 != 0) {
                System.out.print(numero + (numero < 49 ? ", " : ""));
            }
            numero++;
        }
    }
}
