package br.com.alura.comex.modulos;

public class Endereco {
    public String bairro;
    public String cidade;
    public String complemento;
    public String estado;
    public String rua;
    public int numero;

    public void imprimirEndereco(){
        System.out.println("Rua: " + rua + "\nN°: " + numero + "\nBairro: " + bairro + "\nComplemento: " +
                complemento + "\nCidade: " + cidade + "\nEstado: " + estado + "\n");
    }
}
