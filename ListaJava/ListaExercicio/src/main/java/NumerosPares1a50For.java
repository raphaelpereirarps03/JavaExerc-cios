public class NumerosPares1a50For {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + (i < 50 ? ", " : ""));
        }
    }
}
