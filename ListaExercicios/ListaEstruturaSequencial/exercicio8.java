import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Distância percorrida:");
        int Dist = sc.nextInt();

        System.out.println("Combustível gasto:");
        double cGasto = sc.nextDouble();

        double cMedio = (double) (Dist / cGasto);

        System.out.printf("Consumo médio = %.3f \n", cMedio);

        sc.close();
    }
}
