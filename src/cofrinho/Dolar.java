package cofrinho;

public class Dolar extends Moeda {
	public double valorDolar = 4.96;
    public Dolar(String pais, double valor) {
        super(pais, valor);
    }

    @Override
    public double valorEmReal() {
    	return this.getValor() * this.valorDolar;
    }
}
