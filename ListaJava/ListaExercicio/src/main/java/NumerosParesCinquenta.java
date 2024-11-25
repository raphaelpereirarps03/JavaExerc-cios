public class NumerosParesCinquenta {
    public class NumerosPares {
        public static void main(String[] args) {
            int numero = 2;

            do {
                System.out.print(numero + (numero < 50 ? ", " : ""));
                numero += 2;
            } while (numero <= 50);
        }
    }

}
