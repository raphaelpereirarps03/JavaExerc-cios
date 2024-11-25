import java.util.Scanner;
public class VendaProduto {
    public static void main(String[] args) {
        double precoProduto, valorTotal;
        int qtdProduto;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculo do valor total a ser pago na venda de um produto");
        System.out.println("Entre com o preço do produto: ");
        precoProduto = in.nextDouble();
        System.out.println("Entre com a quantidade comprada: ");
        qtdProduto = in.nextInt();


        if (qtdProduto > 10) {
            valorTotal = (precoProduto * qtdProduto) - (((precoProduto * qtdProduto) * 10)/100);
        } else {
            valorTotal = (precoProduto * qtdProduto);
        }

        System.out.println("O valor total a ser pago é: R$" + valorTotal);
    }

}
