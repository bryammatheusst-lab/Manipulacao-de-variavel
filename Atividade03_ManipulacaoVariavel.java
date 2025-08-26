import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {

    public static void main(String[] args) {
        String nomeProduto = "Moletom";
        int quantidadeProdutosComprados = 3;
        double precoUnitarioProduto = 59.90;
        double taxaImpostoSobreProduto = 0.12;
        double margemLucro = 0.25;

        double valorTotalSemImpostos = (precoUnitarioProduto * quantidadeProdutosComprados);
        double valorTotalComImposto = valorTotalSemImpostos + (valorTotalSemImpostos * taxaImpostoSobreProduto);
        double precoVenda = valorTotalComImposto + (valorTotalComImposto * margemLucro);

        String padrao = "R$ ###,##0.00";
        DecimalFormat df = new DecimalFormat(padrao);

        String valorComImpostoFormatado = df.format(valorTotalComImposto);
        String precoVendaFormatado = df.format(precoVenda);

        String mensagemFinal = "O produto seria: " + nomeProduto +"\n"
                + "Total com imposto: " + valorComImpostoFormatado + "\n"
                + "Preço de venda sugerido: " + precoVendaFormatado;

        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço do produto: " + precoUnitarioProduto);
        System.out.println("Quantidade de produtos comprados: " + quantidadeProdutosComprados);
        System.out.println("Taxa de imposto sobre o produto: " +  taxaImpostoSobreProduto);
        System.out.println("Margem de lucro: " + margemLucro);
        System.out.println("Valor total com imposto: " + valorTotalComImposto);
        System.out.println("Valor total sem imposto: " + valorTotalSemImpostos);
        System.out.println("Preço de venda: "  + precoVenda);
        System.out.println();
        System.out.println(mensagemFinal);

    }
}