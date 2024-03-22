package br.com.alura.comex.dao;

import br.com.alura.comex.models.ClientComex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDao {
    private Connection connect;
    public ClientDao(Connection connection) {
        this.connect = connection;
    }

    public void cadastrarClient(ClientComex dadosClient) {

        String sql = "INSERT INTO clientes (nome, cpf, email, telefone)" +
                "VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, dadosClient.nome);
            preparedStatement.setString(2, dadosClient.cpf);
            preparedStatement.setString(3, dadosClient.email);
            preparedStatement.setString(4, dadosClient.telefone);
            preparedStatement.execute();
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar o cliente: " + e);
        }
    }

    public void deletarClient(int idCliente) {
        String sql = "DELETE FROM clientes WHERE id = ?";

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, idCliente);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connect.close();
            System.out.println("Cliente deletado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar cliente: " + e);
        }
    }
}
