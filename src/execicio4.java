import java.util.Scanner;

public class execicio4 {
    public static void main(String[] args) throws Exception {
       
       Scanner ler = new Scanner (System.in);
       int hora;
        System.err.println("Digita a hora");
        hora = ler.nextInt();

        if (hora >= 9 && hora <=18) {
            System.out.println("Está em horário");
        }else{
            System.out.println("Não está em horário comercial");

        }




    }
}
