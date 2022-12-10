import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnit, dinheiro, troco, vCompra;
        int qtde;

      
        System.out.println("               TROCO VERIFICADO               ");

        System.out.print("Preço unitário do produto: ");
        precoUnit = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtde = sc.nextInt();
        System.out.print("Dinheiro recebido: R$");
        dinheiro = sc.nextDouble();

        vCompra = precoUnit * qtde;

        System.out.println("");

        if (dinheiro > vCompra) {
            troco = dinheiro - vCompra;
            System.out.printf("TROCO = R$%.2f%n", troco);            
        } else {
            troco = vCompra - dinheiro;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS. %n", troco);
        }
     

        sc.close();        
    }
}
