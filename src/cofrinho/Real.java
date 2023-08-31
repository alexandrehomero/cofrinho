package cofrinho;

public class Real  extends Moeda{
    private double valorReal = 1;
	public Real(String pais, double valor) {
		super(pais, valor);
	}
	
	@Override
	public double valorEmReal() {
		return this.getValor() * this.valorReal;
	}
}