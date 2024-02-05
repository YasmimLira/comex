package br.com.alura.comex;

import br.com.alura.comex.modulos.Cliente;
import br.com.alura.comex.modulos.Endereco;
import br.com.alura.comex.modulos.Produto;
public class Exerc {
    public static void main(String[] args) {

        // Ex 02
        Produto produto = new Produto();
        Produto produto2 = new Produto();

        produto.setDescricao("Celular que tem a cor cinza");
        produto.setPreco_unitario(1000.00);
        produto.setQuantidade(10);

        produto2.setDescricao("Fone sem fio branco");
        produto2.setPreco_unitario(100.20);
        produto2.setQuantidade(2);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Descrição do produto: " + produto.getDescricao());
        System.out.println("Preço unitário do produto: " + produto.getPreco_unitario());
        System.out.println("Quantidade do produto: " + produto.getQuantidade());

        System.out.println("_________________________________");

        System.out.println("Nome do produto: " + produto2.getNome());
        System.out.println("Descrição do produto: " + produto2.getDescricao());
        System.out.println("Preço unitário do produto: " + produto2.getPreco_unitario());
        System.out.println("Quantidade do produto: " + produto2.getQuantidade());

        System.out.println("_________________________________");

        //  Ex 03
        if(produto.equals(produto2)) {
            System.out.println("Os produtos são iguais");
        }
        else {
            System.out.println("Os produtos não são iguais");
        }

        System.out.println("__________________________________");

        // Ex 04
        System.out.println(produto.toString());
        System.out.println(produto2.toString());


        // Ex 05

        Endereco endereco = new Endereco();
        endereco.setBairro("Jaraguá");
        endereco.setCidade("São Paulo");
        endereco.setRua("Paulo Arentino");
        endereco.setComplemento("-");
        endereco.setEstado("São Paulo");
        endereco.setNumero(137);

        System.out.println(endereco.toString());

        Cliente cliente = new Cliente();
        cliente.setNome("Yasmim");
        cliente.setEmail("yasmim@gmail.com");
        cliente.setTelefone("(99) 99999-9999");
        cliente.setCpf("999.999.999-99");
        cliente.setProfissao("Desenvolvedora");
        cliente.setEndereco(endereco);

        System.out.println(cliente.toString());
    }
}
