package cofrinho;

public class Dolar extends Moeda {
	public double valorDolar = 4.96;
    public Dolar(String tipo, double valor) {
        super(tipo, valor);
    }

    @Override
    public double valorEmReal() {
    	return this.getValor() * this.valorDolar;
    }
}
