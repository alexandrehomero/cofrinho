package cofrinho;

public class Euro extends Moeda{
    private double valorEuro = 5.37;
	public Euro(String tipo, double valor) {
		super(tipo, valor);
	}
	
	@Override
	public double valorEmReal() {
		return this.getValor() * this.valorEuro;
	}
}
