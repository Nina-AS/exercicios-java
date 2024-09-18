import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        String cpf;
        
        System.out.println("Digite seu cpf");
        cpf = ler.nextLine();

        if (cpf.length() != 11) {
            System.out.println("CPF inválido");
        }else{
            System.out.println("CPF correto");
        }








    }
}
