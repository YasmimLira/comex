package br.com.alura.comex.models;

public class ClientComex {
    public String nome;
    public String cpf;
    public String email;
    public String telefone;

    public ClientComex(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
}
