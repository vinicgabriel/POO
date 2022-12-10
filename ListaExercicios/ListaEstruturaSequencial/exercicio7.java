import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nome: ");
        String nome = sc.nextLine();

        System.out.println("Valor por hora:");
        int hValor = sc.nextInt();

        System.out.println("Horas trabalhadas: ");
        double htrab = sc.nextDouble();

        double pagamento = ( hValor * htrab);

        System.out.printf("O pagamento para %s deve ser R$ %.2f \n",nome, pagamento);

        sc.close();
        
    }
}
