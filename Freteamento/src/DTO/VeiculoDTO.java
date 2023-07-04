package DTO;

public class VeiculoDTO {

    private int id;
    private String modelo;
    private String tipo;
    private double peso;

    public VeiculoDTO(int id, String modelo, String tipo, double peso) {
        this.id = id;
        this.modelo = modelo;
        this.tipo = tipo;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
