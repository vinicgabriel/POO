import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nf = 0;

        System.out.println("                NOTAS                 ");
      

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        nf = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", nf);

        if (nf < 60.0) {
            System.out.println("FOI REPROVADO!");
        } 
        sc.close();
    }

    
}
