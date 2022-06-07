package br.com.fiap.banco;


public class ContaCorrente extends Conta {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipo;
	private double chequeEspecial;
	

	
//Atalho (alt+shift+s+r) pra gerar getters and setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
//super misturando caracteristicas da classe mae com a subclasse 	
	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial;
	}
	
/*como é parecido com o outro método da classe mãe 
 * usamos o override pra indicar que vai sobreescrever(polimorfismo) 	
 */
	@Override
	public void retirar (double valor) {
		valor += 10;
		super.retirar(valor);
	}
	

}
