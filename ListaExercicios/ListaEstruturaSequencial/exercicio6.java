import java.util.Scanner;

/**
 * exercicio6
 */
public class exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double vCirculo = sc.nextDouble();

        double area = Math.PI * Math.pow(vCirculo, 2);

        System.out.printf("O Valor da área é = %.3f%n", area);

        sc.close();
    }
}