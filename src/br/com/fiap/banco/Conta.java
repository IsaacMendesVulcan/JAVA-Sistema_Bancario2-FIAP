
package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta bancária 
 * @author Justp
 * @version 1.0
 */


public class Conta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;

	public Conta () {
	}


	public Conta (int agencia, int numero, double saldo) {

		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	
	
	
	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que será depositado
	 */
	public void depositar (double valor) {
		
		this.saldo += valor;
	}
	
	
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor que será retirado
	 * @see depositar
	 */
	public void retirar (double valor) {
		
		this.saldo -= valor;
	}

	
	/**
	 * Verifica o valor do saldo da Conta 
	 * @return Valor do Saldo da Contas
	 */
	public double getSaldo() {
		return this.saldo;
	}
}



