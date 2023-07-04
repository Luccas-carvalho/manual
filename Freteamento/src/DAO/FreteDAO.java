package DAO;

import DTO.FreteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FreteDAO {
    private Connection conn;

    public FreteDAO() {
        conn = new ConexaoDAO().conectaBD();
    }

    public void salvar(FreteDTO frete) {
        String sql = "INSERT INTO Frete (tipo, valor) VALUES (?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, frete.getTipo());
            statement.setDouble(2, frete.getValor());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FreteDAO salvar " + e);
        }
    }

    public List<FreteDTO> listarTodos() {
        List<FreteDTO> fretes = new ArrayList<>();
        String sql = "SELECT * FROM Frete";
        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                FreteDTO frete = new FreteDTO(
                    resultSet.getInt("id"),
                    resultSet.getString("tipo"),
                    resultSet.getDouble("valor")
                );
                fretes.add(frete);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FreteDAO listarTodos " + e);
        }
        return fretes;
    }

    public void atualizar(FreteDTO frete) {
        String sql = "UPDATE Frete SET tipo = ?, valor = ? WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, frete.getTipo());
            statement.setDouble(2, frete.getValor());
            statement.setInt(3, frete.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FreteDAO atualizar " + e);
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM Frete WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FreteDAO excluir " + e);
        }
    }

    public FreteDTO buscarPorId(int id) {
        String sql = "SELECT * FROM Frete WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                FreteDTO frete = new FreteDTO(
                    resultSet.getInt("id"),
                    resultSet.getString("tipo"),
                    resultSet.getDouble("valor")
                );
                return frete;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FreteDAO buscarPorId " + e);
        }
        return null;
    }
}
