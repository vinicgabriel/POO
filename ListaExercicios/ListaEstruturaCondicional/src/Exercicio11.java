import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sal, nSal, aumento;
        int perc;

        System.out.println("                 AUMENTO                 ");


        System.out.print("Digite o salário da pessoa: R$");
        sal = sc.nextDouble();

        if (sal <= 1000) {
            perc = 20;
            nSal = sal + (sal * perc/100);
            aumento = nSal - sal;
                        
        } else if (sal > 1000 && sal <= 3000) {
            perc = 15;
            nSal = sal + (sal * perc/100);
            aumento = nSal - sal;
            
        } else if (sal > 8000) {
            perc = 5;
            nSal = sal + (sal * perc/100);
            aumento = nSal - sal;
            
        } else {
            perc = 10;
            nSal = sal + (sal * perc/100);
            aumento = nSal - sal;
            
        }        
        

        System.out.printf("O Novo salário = R$%.2f%n", nSal);
        System.out.printf("Aumento = R$%.2f%n", aumento);
        System.out.println("Porcentagem = " + perc + "%");

        sc.close();
    }
    
}
