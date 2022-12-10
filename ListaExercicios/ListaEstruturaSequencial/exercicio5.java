import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double produto = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantc = sc.nextInt();

        System.out.print("Dinheiro recebido:");
        int dinRecebido = sc.nextInt();

        double troco = dinRecebido - (produto * quantc);

        System.out.printf(" TROCO = R$ %.2f%n", troco );
        
        sc.close();

    }
}
