import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double fatura = 50.0;


        System.out.println("              OPERADORA               ");

        System.out.print("Escreva a quantidade de minutos: ");
        int minutos = sc.nextInt();

        if (minutos > 100) {
            fatura += (minutos - 100) * 2;            
        } 
        
        System.out.printf("Valor a pagar: R$%.2f%n", fatura);
        sc.close();
    }

    
}