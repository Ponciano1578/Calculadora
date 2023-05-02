
public class Controladora {

	private double total;
	
	public double realizarOperacao(EnumOperacao operacao , double valor) {
		if (operacao.equals(EnumOperacao.Soma)) {
			total += valor;
		}	
		else if (operacao.equals(EnumOperacao.Subtracao)) {
			total -= valor;
		}
		else if (operacao.equals(EnumOperacao.Divisao)) {
			total /= valor;
		}
		else if (operacao.equals(EnumOperacao.Multiplicacao)) {
			total *= valor;
		}
	   return total;
	}
	
	public double getTotal() {
		return this.total;
  }
	public void zerar() {
		total = 0 ;
	}
}
