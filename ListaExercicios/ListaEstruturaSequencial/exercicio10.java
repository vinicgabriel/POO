import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a duração em segundos:");
        int segundos = sc.nextInt();


        int horas = segundos / 3600; 

        int minutos = (segundos % 3600 ) / 60;

        int segundos2 = (segundos % 3600 ) % 60;

        System.out.printf("%d:%d:%d \n", horas, minutos, segundos2);

        sc.close();


    }
} 
    
