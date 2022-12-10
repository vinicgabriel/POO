import java.util.Scanner;

public class exercicio9 {
    /**
     * Innerexercicio9
     */
    public class Innerexercicio9 {
    
        public static void main(String[] args) {
                
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite a medida A:");
            double a = sc.nextDouble();;
            
            System.out.println("Digite a medida B:");
            double b = sc.nextDouble();

            System.out.println("Digite a medida C:");
            double c = sc.nextDouble();

            double quadrado = a * a;

            double aTriangulo = ( a * b ) / 2;

            double trapz = ((a + b )* c) / 2;

            System.out.printf("ÁREA DO QUADRADO = %.4f%n", quadrado);

            System.out.printf("ÁREA DO TRIÂNGULO = %.4f%n", aTriangulo);

            System.out.printf("ÁREA DO TRAPEZIO = %.4f%n", trapz);

            sc.close();


            }
    }
}
