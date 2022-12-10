package ex01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("Dados do Cliente");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("CPF : ");
        String cpf = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.println();

        Cliente cliente = new Cliente(nome, endereco, cpf, idade);

        System.out.println("O CPF possui 11 digitos? " + cliente.valCPF());
        System.out.println(cliente.toString());     

        sc.close();
    }
}
