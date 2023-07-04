
import DAO.FreteDadosDAO;
import DAO.UsuarioDAO;
import DTO.FreteDadosDTO;
import DTO.UsuarioDTO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculadoraFrete {

    public static ResultadoFrete calcularFrete(String produto, String tipoVeiculoEscolhido, int distancia, int pesoProduto) {

        //Pega a data atual
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataSolicitacao = dataAtual.format(formatter);

        //Pega os pesos correspondentes ao produto e ao tipo de veículo
        double pesoTipoVeiculoCalculo = 0.0;

        switch (tipoVeiculoEscolhido) {
            case "Caminhonete":
                pesoTipoVeiculoCalculo = 2.5;
                break;
            case "Furgão":
                pesoTipoVeiculoCalculo = 1.0;
                break;
            case "Caminhão":
                pesoTipoVeiculoCalculo = 3.0;
                break;
            default:
                break;
        }

        double valorFrete = distancia * pesoProduto * pesoTipoVeiculoCalculo;

        // Calcula a taxa com base nos KM
        double taxa = 0.0;
        if (distancia <= 100) {
            taxa = valorFrete * 0.05;
        } else if (distancia <= 200) {
            taxa = valorFrete * 0.07;
        } else if (distancia <= 500) {
            taxa = valorFrete * 0.09;
        } else {
            taxa = valorFrete * 0.10;
        }

        double valorTotalFrete = valorFrete;

        FreteDadosDTO freteDadosDTO = new FreteDadosDTO(tipoVeiculoEscolhido, produto, pesoProduto, valorTotalFrete, taxa, distancia, dataSolicitacao);
        FreteDadosDAO freteDadosDAO = new FreteDadosDAO();
        freteDadosDAO.salvar(freteDadosDTO);
        return new ResultadoFrete(valorTotalFrete, taxa, dataSolicitacao);
    }
}

class ResultadoFrete {

    private double valorTotalFrete;
    private double taxa;
    private String dataSolicitacao;

    public ResultadoFrete(double valorFrete, double taxa, String dataSolicitacao) {
        this.valorTotalFrete = valorFrete;
        this.taxa = taxa;
        this.dataSolicitacao = dataSolicitacao;
    }

    public double getValorTotalFrete() {
        return valorTotalFrete;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }
}
