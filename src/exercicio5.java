import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (em metros): ");
        double distância = ler.nextDouble();
        System.out.println("Digite o tempo gasto (em segundo): ");
        double segundo = ler.nextDouble();

        double velocidadeMedia = distância;
        
        if (velocidadeMedia < 5) {
            System.out.println("Movimento lento");
        }else if (velocidadeMedia >=5 && velocidadeMedia <= 15) {
            System.out.println("Movimento moderedo");
        }else{
            System.out.println("Movimento rápido");
        }
      
    
        


    }
}
