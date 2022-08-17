package br.senai.sp.jandira.model;

public class Conta {
	
	public String numero;
	public String tipoConta;
	public String cliente;
	public double saldo;
	
	public void transferir(){
		
	}
	
	public void depositar(){
		
	}
	
	public void sacar(){
			
	}
	
	public void exibirDadosDaConta() {
		System.out.printf("Número da conta:%s\n",numero);
		System.out.printf("Nome do cliente:%s\n",cliente);
		System.out.printf("Tipo da conta:%s\n",tipoConta);
		System.out.printf("Saldo:%s\n",saldo);
		System.out.println("-----------------------------");
	}
}
