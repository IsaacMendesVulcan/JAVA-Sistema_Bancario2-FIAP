package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
/*podemos trabalhar com objetos da propria superclasse e 
 trabalhar 👇 com a criação da variavel a partir da superclasse */
		Conta conta = new Conta();

/*podemos tambem trabalhar com objetos a partir da subclasse e 
 trabalhar 👇 com variaveis criadas a partir da superclasse*/
		Conta cc = new ContaCorrente();

/*e podemos trabalhar com objetos e variáveis a partir da subclasse (ContaCorrente) */
		
/*Podemos pegar a variavel criada a partir da superclasse e forçar a 
 ser controlada agora a partir de uma variavel da subclasse e a partir 
 disso podemos acessar todos os metodos que tambem estao na subclasse*/
		ContaCorrente c1 = (ContaCorrente) cc;
		
/*OBS:para não correr riscos é importante usar uma 
condição pra verificar se a variavel é realmente 
uma instancia do objeto que esta sendo esperado 
usando a condição "instanceof"*/
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente c2 = (ContaCorrente) conta;
		}	

	}
}
