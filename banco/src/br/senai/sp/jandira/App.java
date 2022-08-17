package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Conta;

public class App {

	  public static void main(String[] args) {
		  
		Scanner leitor = new Scanner(System.in);
	
		Conta contaDaMaria = new Conta();
		Conta contaDoJoao = new Conta();
		
		contaDaMaria.numero = "001-8"; 
		contaDaMaria.cliente = "Maria de Jesus";
		contaDaMaria.tipoConta = "Corrente";
		contaDaMaria.saldo = 217.57;
		
		
		contaDoJoao.numero = "001-23"; 
		contaDoJoao.cliente = "João Fernando";
		contaDoJoao.tipoConta = "Poupança";
		contaDoJoao.saldo = 3.33;
		
//		System.out.printf("\nNome do cliente: %s",contaDaMaria.cliente);
//		System.out.printf("\nTipo de conta: %s",contaDaMaria.tipoConta);
//		System.out.printf("\nSaldo da conta: %s\n",contaDaMaria.saldo);
//		
//		System.out.printf("\nNome do cliente: %s",contaDoJoao.cliente);
//		System.out.printf("\nTipo de conta: %s",contaDoJoao.tipoConta);
//		System.out.printf("\nSaldo da conta: %s",contaDoJoao.saldo);
		
		contaDaMaria.exibirDadosDaConta();
		contaDoJoao.exibirDadosDaConta();
		
		
	}

}
