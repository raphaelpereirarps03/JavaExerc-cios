public class NumerosImparesDoWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 2 != 0) {
                System.out.print(i + (i < 49 ? ", " : ""));
            }
            i++;
        } while (i <= 50);
    }
}
