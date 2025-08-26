import java.util.Scanner;

public class Atividade05_ManipulacaoVariavel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do aluno entre o e 10: ");
        double nota = scan.nextDouble();

        if (nota >= 9){
            System.out.println("Exelente!");
        } else if (nota >= 7) {
            System.out.println("Bom!");
        } else if (nota >= 5) {
            System.out.println("Satisfatória!");
        } else {
            System.out.println("Insatisfatória!");
        }

        scan.close();

    }

}