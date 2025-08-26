import java.util.Scanner;

public class Atividade13_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double valorCompra = scn.nextDouble();

        double percentualDesconto;

        if (valorCompra > 500){
            percentualDesconto = 20;
        } else if (valorCompra >= 200) {
            percentualDesconto = 10;
        } else if (valorCompra >= 100) {
            percentualDesconto = 5;
        } else {
            percentualDesconto = 0;
        }

        double valorDesconto = valorCompra * percentualDesconto / 100;
        double valorFinal = valorCompra -  valorDesconto;

        System.out.println("Valor da compra sem o desconto: " + valorCompra);
        System.out.println("Percentual de desconto aplicado: " +  percentualDesconto + "%");
        System.out.println("Valor descontado: " + valorDesconto);
        System.out.println("Valor final da compra: " + valorFinal);


        scn.close();
    }
}