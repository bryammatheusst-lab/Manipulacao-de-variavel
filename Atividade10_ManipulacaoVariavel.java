
import java.util.Scanner;

public class Atividade10_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite uma operação (+, -, * ou /): ");
        String operacao = scn.next();

        System.out.println("Digite o primeiro número: ");
        double numero1 = scn.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scn.nextDouble();

        if (operacao.equals("+")) {
            double adicao = numero1 + numero2;
            System.out.println("Resultado: " + adicao);
        } else if (operacao.equals("-")) {
            double subtracao = numero1 - numero2;
            System.out.println("Resultado: " +  subtracao);
        }  else if (operacao.equals("*")) {
            double multiplicacao = numero1 * numero2;
            System.out.println("Resultado: " + multiplicacao);
        }  else if (operacao.equals("/")) {
            double divisao = numero1 / numero2;
            System.out.println("Resultado: " + divisao);
        } else {
            System.out.println("Operação invalida!");
        }

        scn.close();
    }
}
