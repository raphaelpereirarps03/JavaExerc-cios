import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        double area, base, altura;
        Scanner in = new Scanner (System.in);

        System.out.println("Calculo da área de um triangulo");
        System.out.println("Entre com a base do triangulo: ");
        base = in.nextDouble();
        System.out.println("Entre com a altura do triangulo: ");
        altura = in.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("Base: %.2f \n" , base);
        System.out.printf("Altura: %.2f \n" , altura);
        System.out.printf("Área: %.2f \n" , area);
    }
}
