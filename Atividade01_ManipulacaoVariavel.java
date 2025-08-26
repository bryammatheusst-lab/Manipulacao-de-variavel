
public class Atividade01_ManipulacaoVariavel {

    public static void main(String[] args) {

        String nomePessoa = "Bryam";
        int idadePessoa = 20;
        double alturaPessoa = 1.72;
        boolean estudante = (true);

        int idadePessoa2 = 25;

        double somaDasDuasIdades = (idadePessoa + idadePessoa2);
        double multiplicacaoDaAltura = (alturaPessoa) * 2;

        System.out.println("Nome: " + nomePessoa);
        System.out.println("Altura: " + alturaPessoa);
        System.out.println("Idade: " + idadePessoa);
        System.out.println("É estudante:" + estudante);
        System.out.println("Soma das idades: " + somaDasDuasIdades );
        System.out.println("Altura dobrada: " + multiplicacaoDaAltura);

    }
}
