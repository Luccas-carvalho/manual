package DAO;

import DTO.ProdutoDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    private Connection conn;

    public ProdutoDAO() {
        conn = new ConexaoDAO().conectaBD();
    }

    public void salvar(ProdutoDTO produto) {
        String sql = "INSERT INTO Produto (nome, peso) VALUES (?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPeso());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO  salvar" + e);
        }
    }

    public List<ProdutoDTO> listarTodos() {
        List<ProdutoDTO> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produto";
        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                ProdutoDTO produto = new ProdutoDTO(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getDouble("peso"));
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setPeso(resultSet.getDouble("peso"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO  listarTodos" + e);
        }
        return produtos;
    }

    public void atualizar(ProdutoDTO produto) {
        String sql = "UPDATE Produto SET nome = ?, peso = ? WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPeso());
            statement.setInt(3, produto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO  atualizar" + e);
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM Produto WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO  excluir" + e);
        }
    }

    public ProdutoDTO buscarPorId(int id) {
        String sql = "SELECT * FROM Produto WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                ProdutoDTO produto = new ProdutoDTO(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getDouble("peso"));
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setPeso(resultSet.getDouble("peso"));
                return produto;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO  buscarPorId" + e);
        }
        return null;
    }
}
