package br.com.fiap.banco;

public class Program extends Conta{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
/* Para verificar se o objeto é do tipo de umca classe, podemos utilizar a instrução
 instanceof. Essa instrução retorna true caso o objeto á esquerda do operador seja
 do tipo (classe) especificado á direita do operador. Exemplo: */
	
			
			/*Conta cc = new Conta();
	        if (cc instanceof Conta){
	            System.out.println("cc é do tipo Conta");
	        }else{
	            System.out.println("cc não é do tipo Conta");
	        }*/
	    
/*O resultado é "cc é do tipo Conta".*/
	        
/*E se alterarmos o programa para instanciar um objeto do tipo 
  ContaCorrente	ao invés do tipo Conta, qual será o resultado?*/    
	       
	       /* Conta cc = new ContaCorrente();
	        if (cc instanceof Conta){
	        	System.out.println("cc é do tipo Conta");
	        }else{
	        	System.out.println("cc não é do tipo Conta");
	        }*/ 
	        
	        
/*"cc é do tipo Conta"*/
	       
/*Se alterarmos o programa para instanciar um objeto do tipo ContaCorrente
 ao invés do tipo Conta, qual será o resultado?*/
	        
	 
	        Conta cc = new Conta();
	        if (cc instanceof ContaCorrente){
	        	System.out.println("cc é do tipo ContaCorrente");
	        }else{
	        	System.out.println("cc não é do tipo ContaCorrente");
	        }
/*"cc não é do tipo ContaCorrente", pois uma Conta não é necessariamente uma 
 ContaCorrente*/
	
	
	}

}
	        


	
	
	


