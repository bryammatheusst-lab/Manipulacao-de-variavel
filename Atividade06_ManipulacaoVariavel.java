
import java.util.Scanner;

public class Atividade06_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scn =new Scanner(System.in);

        System.out.println("Por favor, digite um número: ");
        int numero = scn.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par!");
        }else{
            System.out.println("O número " + numero + " é ímpar!");
        }

        scn.close();
    }
}
