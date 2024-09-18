import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        int parcela;
        double valorEmprestimo;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor do Empréstimo");
            double valoremprestimo = ler.nextDouble();

        System.out.println("Digite o número da parcela");
            int parcelar = ler.nextInt();

        System.out.println("Digite o valor do salario");
           double salario = ler.nextDouble();

        double valorParcela = valoremprestimo;
        if (valorParcela <= salario * 0.3) {
          System.out.println("Emprestimo aprovado!");  
        }else{
            System.out.println("Emprestimo negado, você ésta pobre!!!!");
        }
   

















    }// fim class
}// fim main










