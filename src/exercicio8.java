import java.util.Scanner;

public class exercicio8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Array para armazenar 5 números
        int soma = 0;

        // Leitura dos números
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Cálculo da soma
        for (int numero : numeros) {
            soma += numero;
        }

        // Exibição do resultado
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}