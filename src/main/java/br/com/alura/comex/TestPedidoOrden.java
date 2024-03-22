package br.com.alura.comex;

import br.com.alura.comex.models.Pedido;
import br.com.alura.comex.models.Client;
import java.util.ArrayList;
import java.util.Comparator;
public class TestPedidoOrden {
    public static void main(String[] args) {
        Client novoCliente = new Client();
        novoCliente.nome = "Patricia";
        novoCliente.cpf = "123.456.789-5";
        novoCliente.email = "juliane@gmail.com";
        novoCliente.profissao = "Contadora";
        novoCliente.telefone = "(11)3232-3434";
        novoCliente.address = null;

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        pedido1.setCliente(novoCliente);
        pedido1.setPreco(7.99);
        pedido1.setQuantidade(4);

        Pedido pedido2 = new Pedido();
        pedido2.setId(2);
        pedido2.setCliente(novoCliente);
        pedido2.setPreco(9.99);
        pedido2.setQuantidade(6);

        Pedido pedido3 = new Pedido();
        pedido3.setId(3);
        pedido3.setCliente(novoCliente);
        pedido3.setPreco(12.99);
        pedido3.setQuantidade(8);

        Pedido pedido4 = new Pedido();
        pedido4.setId(4);
        pedido4.setCliente(novoCliente);
        pedido4.setPreco(15.99);
        pedido4.setQuantidade(10);

        Pedido pedido5 = new Pedido();
        pedido5.setId(5);
        pedido5.setCliente(novoCliente);
        pedido5.setPreco(18.99);
        pedido5.setQuantidade(12);

        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);
        listaPedidos.sort(Comparator.comparing(Pedido::getValorTotal));

        System.out.print(listaPedidos);
        listaPedidos.sort(Comparator.comparing(Pedido::getValorTotal).reversed());
    }
}
