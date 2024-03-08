package br.com.alura.comex.models;

public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Imprimir produtos
    public void imprimirProdutos(){
        System.out.println("Nome: " + nome + "\nDescrição: " + descricao + "\nPreço Unitário: " + precoUnitario +
                "\nQuantidade: " + quantidade + "\n");
    }

}
