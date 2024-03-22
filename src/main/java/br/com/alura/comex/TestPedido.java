package br.com.alura.comex;

import br.com.alura.comex.models.Pedido;
import br.com.alura.comex.models.Client;
import br.com.alura.comex.models.Produto;
public class TestPedido {
        public static void main(String[] args) {
            Client novoCliente = new Client();
            novoCliente.nome = "Patricia";
            novoCliente.cpf = "123.456.789-5";
            novoCliente.email = "juliane@gmail.com";
            novoCliente.profissao = "Contadora";
            novoCliente.telefone = "(11)3232-3434";
            novoCliente.address = null;

            Produto novoProduto = new Produto();
            novoProduto.setNome("Detergente");
            novoProduto.setDescricao("Produto usado para lavar louças");
            novoProduto.setPrecoUnitario(2.99);
            novoProduto.setQuantidade(8);

            Pedido novoPedido = new Pedido();
            novoPedido.setId(1);
            novoPedido.setCliente(novoCliente);
            novoPedido.setPreco(2.99);
            novoPedido.setQuantidade(8);

            System.out.println(novoPedido);
        }

}
