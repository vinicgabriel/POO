import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("TABUADA");


        System.out.print("Deseja a tabuada para qual valor? ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int tabuada = N * i;
            System.out.printf("%d x %d = %d %n", N, i, tabuada);
        }
        sc.close();
    }
    
}
