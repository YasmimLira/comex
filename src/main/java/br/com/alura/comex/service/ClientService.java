package br.com.alura.comex.service;

import br.com.alura.comex.dao.ClientDao;
import br.com.alura.comex.models.ClientComex;
import br.com.alura.comex.connection.ConnectionFactory;
public class ClientService {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        ClientDao dao = new ClientDao(connectionFactory.conexaoComex());

        // Cadastrar cliente
        ClientComex cliente = new ClientComex("Camila", "76841058765", "camila@gmail.com", "1144427834");
        dao.cadastrarClient(cliente);

        // Excluir cliente
        int excluirCliente = 3;
        dao.deletarClient(excluirCliente);
    }
}
