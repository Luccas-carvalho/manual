package DAO;
import DTO.VeiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VeiculoDAO {
    private Connection conn;

    public VeiculoDAO() {
        conn = new ConexaoDAO().conectaBD();
    }

    public void salvar(VeiculoDTO veiculo) {
        String sql = "INSERT INTO Veiculo (modelo, tipo, peso) VALUES (?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, veiculo.getModelo());
            statement.setString(2, veiculo.getTipo());
            statement.setDouble(3, veiculo.getPeso());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO Salvar " + e);
        }
    }

    public List<VeiculoDTO> listarTodos() {
        List<VeiculoDTO> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM Veiculo";
        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                VeiculoDTO veiculo = new VeiculoDTO(resultSet.getInt("id"), resultSet.getString("modelo"), resultSet.getString("tipo"), resultSet.getDouble("peso"));
                veiculo.setId(resultSet.getInt("id"));
                veiculo.setModelo(resultSet.getString("modelo"));
                veiculo.setTipo(resultSet.getString("tipo"));
                veiculo.setPeso(resultSet.getDouble("peso"));
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO listarTodos " + e);
        }
        return veiculos;
    }

    public void atualizar(VeiculoDTO veiculo) {
        String sql = "UPDATE Veiculo SET modelo = ?, tipo = ?, peso = ? WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, veiculo.getModelo());
            statement.setString(2, veiculo.getTipo());
            statement.setDouble(3, veiculo.getPeso());
            statement.setInt(4, veiculo.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO atualizar " + e);
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM Veiculo WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO excluir " + e);
        }
    }

    public VeiculoDTO buscarPorId(int id) {
        String sql = "SELECT * FROM Veiculo WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                VeiculoDTO veiculo = new VeiculoDTO(resultSet.getInt("id"), resultSet.getString("modelo"), resultSet.getString("tipo"), resultSet.getDouble("peso"));
                veiculo.setId(resultSet.getInt("id"));
                veiculo.setModelo(resultSet.getString("modelo"));
                veiculo.setTipo(resultSet.getString("tipo"));
                veiculo.setPeso(resultSet.getDouble("peso"));
                return veiculo;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "VeiculoDAO buscarPorId " + e);
        }
        return null;
    }
}
