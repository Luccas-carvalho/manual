package DTO;

public class FreteDadosDTO {


    private String tipoVeiculo;
    private String produto;
    private int pesoProduto;
    private double valorTotalFrete;
    private double taxa;
    private int distancia;
    private String dataSolicitacao;

    public FreteDadosDTO(String tipoVeiculo, String produto, int pesoProduto, double valorTotalFrete, double taxa, int distancia, String dataSolicitacao) {
        this.tipoVeiculo = tipoVeiculo;
        this.produto = produto;
        this.pesoProduto = pesoProduto;
        this.valorTotalFrete = valorTotalFrete;
        this.taxa = taxa;
        this.distancia = distancia;
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getProduto() {
        return produto;
    }

    public int getPesoProduto() {
        return pesoProduto;
    }

    public double getValorTotalFrete() {
        return valorTotalFrete;
    }

    public double getTaxa() {
        return taxa;
    }

    public int getDistancia() {
        return distancia;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setPesoProduto(int pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    public void setValorTotalFrete(double valorTotalFrete) {
        this.valorTotalFrete = valorTotalFrete;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

}
