package test;

import dominio.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        ArrayList<Pessoa> list = new ArrayList<>();


        pessoa.cadastro();

        System.out.println("------------------");

        pessoa2.cadastro();
        sc.close();

        list.add(pessoa);
        list.add(pessoa2);

        for (Pessoa pessoa1 : list) {
            System.out.println("Dados cadastrais:");
            System.out.println("nome: " + pessoa1.getName());
            System.out.println("sobrenome: " + pessoa1.getSobrenome());
            System.out.println("cpf: " + pessoa1.getCpf());
            System.out.println("email: " + pessoa1.getEmail());
            System.out.println("-------------------------");
        }


    }
}




