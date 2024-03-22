package br.com.alura.comex.models;

import br.com.alura.comex.executables.TranslateAPI;

public class Address {
    public String nome;
    public String cep;
    public String bairro;
    public String cidade;
    public String complemento;
    public String estado;
    public String rua;
    public int numero;

    public Address(TranslateAPI api) {
        this.bairro = api.bairro();
        this.cidade = api.localidade();
        this.complemento = api.complemento();
        this.estado = api.uf();
        this.cep = api.cep();
        this.nome = api.logadouro();

    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", numero=" + numero +
                '}';
    }
}
