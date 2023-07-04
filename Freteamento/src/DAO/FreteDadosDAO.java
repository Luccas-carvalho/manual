package DAO;

import DTO.FreteDadosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FreteDadosDAO {

    private Connection conn;

    public FreteDadosDAO() {
        conn = new ConexaoDAO().conectaBD();
    }

    public void salvar(FreteDadosDTO frete) {
        String sql = "INSERT INTO FreteDados (Veiculo, Produto, pesoProduto, valorFrete, valorTaxaFrete, distancia, dataSolicitacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, frete.getTipoVeiculo());
            statement.setString(2, frete.getProduto());
            statement.setInt(3, frete.getPesoProduto());
            statement.setDouble(4, frete.getValorTotalFrete());
            statement.setDouble(5, frete.getTaxa());
            statement.setInt(6, frete.getDistancia());
            statement.setString(7, frete.getDataSolicitacao());

            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FreteDadosDAO salvar" + e);
            System.out.println(e);
        }
    }

}
