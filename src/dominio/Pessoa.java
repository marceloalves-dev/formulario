package dominio;

import java.util.Scanner;

public class Pessoa {
    private String name;
    private String sobrenome;
    private String cpf;
    private String email;


    public void cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nome: ");
        String name = sc.next();
        setName(name);

        System.out.print("sobrenome: ");
        String sobrenome = sc.next();
        setSobrenome(sobrenome);

        System.out.print("cpf: ");
        String cpf = sc.next();
        setCpf(cpf);

        System.out.print("email: ");
        String email = sc.next();
        setEmail(email);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Verificacao.name(name)) {
            this.name = name;
        } else {
            System.out.println("nome errado");
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (Verificacao.name(sobrenome)) {
            this.sobrenome = sobrenome;
        } else {
            System.out.println("sobrenome errado");
        }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (Verificacao.cpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("cpf errado");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Verificacao.email(email)) {
            this.email = email;
        } else {
            System.out.println("email errado");
        }

    }
}
