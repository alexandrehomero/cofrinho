package cofrinho;

public class Real  extends Moeda{
    private double valorReal = 1;
	public Real(String tipo, double valor) {
		super(tipo, valor);
	}
	
	@Override
	public double valorEmReal() {
		return this.getValor() * this.valorReal;
	}
}