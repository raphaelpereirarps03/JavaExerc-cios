package comandoscondicionais;
import java.util.Scanner;
public class BKSwitch {
    public static void main(String[] args) {
        int combo;
        String descCombo;
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com um número referente à um combo do Burguer King: ");
        System.out.println("1 - Combo Costela;\n2 - Combo BK Original;\n3 - Combo BK Whopper Rodeio;\n4 - Combo Mega Stacker Atômico;\n5 - Combo Whopper Furioso");
        combo = in.nextInt();

        switch (combo) {
            case 1: descCombo = "1 - Combo Costela:\nSanduíche no pão de brioche com hambúrguer de carne bovina grelhada, 2 fatias de queijo sabor cheddar, carne de costela bovina desfiada, chutney de cebola roxa, cebola crispy, 3 anéis de onion rings e maionese de alho.";
            break;
            case 2: descCombo = "2 - Combo BK Original:\nSanduíche no pão de brioche, maionese temperada, cebola salteada, queijo e uma carne suculenta; Acompanhamentos: Pepsi 300ml e Batata Frita Média.";
            break;
            case 3: descCombo = "3 - Combo BK Whopper Rodeio: \nUm hambúrguer com uma carne bovina grelhada de 113g, pão com gergelim, queijo derretido, molho barbecue, salada fresca (alface, tomate), onion rings e maionese Bk. Acompanha batata frita e bebida.";
            break;
            case 4: descCombo = "4 - Combo Mega Stacker Atômico: \nUm hambúrguer com três carnes bovinas grelhadas de 113g, pão com gergelim, queijo derretido, fatias de bacon crocante e o exclusivo molho bk stacker. Acompanha batata frita e bebida.";
            break;
            case 5: descCombo = "5 - Combo Whopper Furioso: \nUm hambúrguer de carne bovina grelhado de 113g, pão com gergelim, queijo derretido, onion rings , fatias de bacon crocante, pimenta-jalapeño, salada fresca (alface e tomate), o exclusivo molho furioso e maionese bk. Acompanha batata frita e bebida.";
            break;
            default:descCombo = "Combo inválido";
        }

        System.out.println(descCombo);

    }
}
