package cofrinho;

public abstract class Moeda {
    private String pais;
    private double valor;

    public Moeda(String pais, double valor) {
        this.pais = pais;
        this.valor = valor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double valorEmReal();
}