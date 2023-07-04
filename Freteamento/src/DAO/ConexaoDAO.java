package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/CRUD_FRETE";
            String user = "root";
            String password = "sua_senha_aqui";  // Altere esta linha com sua senha

            conn = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexao: " + e);
        }

        return conn;
    }
}
