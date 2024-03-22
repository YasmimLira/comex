package br.com.alura.comex.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection conexaoComex() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/comex?user=root&password=123456789");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
