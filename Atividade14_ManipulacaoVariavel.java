
import java.util.Scanner;

public class Atividade14_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Insira o sálario bruto do funcionário: ");
        double salarioBruto = scn.nextDouble();

        System.out.println("Insira a quantos anos o funcionario esta na empresa: ");
        int anosTrabalhados = scn.nextInt();

        double bonus;

        if (anosTrabalhados > 10) {
            bonus = 10;
        } else if (anosTrabalhados >= 5) {
            bonus = 5;
        } else {
            bonus = 0;
        }

        double valorImposto;

        if (salarioBruto > 5000) {
            valorImposto = 27;
        } else if (salarioBruto >= 3000) {
            valorImposto = 18;
        } else {
            valorImposto = 10;
        }

        double bonusReais = salarioBruto * bonus / 100;
        double valorImpostoReais  = salarioBruto * valorImposto / 100;
        double salarioLiquido = salarioBruto + bonusReais - valorImpostoReais;

        System.out.println("Sálario bruto: " +  salarioBruto);
        System.out.println("Bônus recebido: " + bonusReais);
        System.out.println("Valor imposto: " + valorImposto + "%");
        System.out.println("Imposto descontado: " + valorImpostoReais);
        System.out.println("Sálario líquido: " + salarioLiquido);

        scn.close();
    }
}
