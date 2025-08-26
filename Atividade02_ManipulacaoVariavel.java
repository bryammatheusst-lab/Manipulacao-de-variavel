
public class Atividade02_ManipulacaoVariavel {

    public static void main(String[] args) {

        String nome = "Bryam";
        int idade = 18;
        int mesesTrabalhados = 10;
        int produtosComprados = 15;
        double salario = 2700.00;

        double salarioAnualBruto = (salario * mesesTrabalhados);
        double salarioAnualLiquido = (salarioAnualBruto) - 2000.00;

        double mediaValorGasto = produtosComprados / 150.00;

        System.out.println("Olá " + nome + ", o valor de seu sálario anual líquido seria de: " + salarioAnualLiquido);

        System.out.println("Dados complementares:");
        System.out.println("Idade: " + idade);
        System.out.println("Meses trabalhados: " + mesesTrabalhados);
        System.out.println("Salário: " + salario);
        System.out.println("Produtos comprados: " + produtosComprados);
        System.out.println("Média de valor gasto: " + mediaValorGasto);
        System.out.println("Salário anual bruto: " + salarioAnualBruto);
        System.out.println("Salário anual líquido: " + salarioAnualLiquido);
    }
}
