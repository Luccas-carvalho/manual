
import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelaFreteDados {

    private Connection conn;

    public TabelaFreteDados() {
        conn = new ConexaoDAO().conectaBD();
    }

    public void preencherTabela(JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0); // Limpa a tabela antes de preenchê-la novamente

        String sql = "SELECT Veiculo, Produto, pesoProduto, valorFrete, valorTaxaFrete, distancia, dataSolicitacao FROM FreteDados";
        try (Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String veiculo = resultSet.getString("Veiculo");
                String produto = resultSet.getString("Produto");
                double pesoProduto = resultSet.getDouble("pesoProduto");
                double valorFrete = resultSet.getDouble("valorFrete");
                double valorTaxaFrete = resultSet.getDouble("valorTaxaFrete");
                double distancia = resultSet.getDouble("distancia");
                String dataSolicitacao = resultSet.getString("dataSolicitacao");

                // Adicione os dados na tabela
                model.addRow(new Object[]{produto, pesoProduto, veiculo, distancia, valorFrete, valorTaxaFrete, dataSolicitacao});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela: " + e.getMessage());
            e.printStackTrace(); // Adicione essa linha para imprimir a pilha de erros
        }

    }
}
