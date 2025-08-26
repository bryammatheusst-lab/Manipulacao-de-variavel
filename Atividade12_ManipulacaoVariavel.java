
import java.util.Scanner;

public class Atividade12_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = scn.nextDouble();

        if (numero > 0){
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        scn.close();

    }
}
