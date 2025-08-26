
import java.util.Scanner;

public class Atividade04_ManipulacaoVariavel {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Por favor, digite a sua idade: ");
        int idade = scn.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade");

        }
        scn.close();
    }
}
