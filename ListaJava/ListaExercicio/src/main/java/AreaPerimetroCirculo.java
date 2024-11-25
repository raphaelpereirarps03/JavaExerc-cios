import java.util.Scanner;
public class AreaPerimetroCirculo {
    public static void main(String[] args) {
        double area,perimetro, raio, PI = 3.14;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o raio do círculo: ");
        raio = in.nextDouble();

        perimetro = 2 * PI * raio;
        area = PI * (raio*raio);

        System.out.printf("Raio =~ %.2f\n" , raio);
        System.out.printf("Área =~ %.2f\n" , area);
        System.out.printf("Perímetro =~ %.2f\n" , perimetro);

    }
}
