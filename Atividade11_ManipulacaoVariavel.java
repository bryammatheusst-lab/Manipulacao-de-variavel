import java.util.Scanner;

public class Atividade11_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a temperatura (em °C): ");
        double temperatura = scn.nextDouble();

        if (temperatura > 30){
            System.out.println("Quente!");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("Agradável!");
        } else {
            System.out.println("Frio!");
        }

        scn.close();
    }
}