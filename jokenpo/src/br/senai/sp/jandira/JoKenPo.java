package br.senai.sp.jandira;

import java.util.Scanner;
public class JoKenPo {
	

	public static void main(String[] args) {
		
		int jogador,computador;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--------------------✊✋✌️--------------------\n");
		System.out.println("******JoKenpô******\n");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("-------------------------");
		System.out.println("Escolha seu movimento:");
		
		//Jogador
		
		jogador = teclado.nextInt();
		
		
		switch(jogador) {
		case 1:
			System.out.println("Você escolheu Pedra!\n");
			break;
		case 2:
			System.out.println("Você escolheu Papel!\n");
			break;
		case 3:
			System.out.println("Você escolheu Tesoura!\n");
			break;
			default:
				System.out.println("Opção inválida");
				System.out.println("Jogo cancelado");
		}
		teclado.close();
		
		//Computador
		
		computador = (int)(Math.random()*3+1);
		switch(computador) {
		case 1:
			System.out.println("Computador escolheu Pedra!\n");
			break;
		case 2:
			System.out.println("Computador escolheu Papel!\n");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura!\n");
			break;
		}
		//Vencedor
		
		System.out.println("---------------✊✋✌️--------------");
		if (jogador == computador) {
			System.out.println("Parabéns! Empatou");
		} else {
			if((jogador == 1 && computador == 3) ||
			(jogador == 2 && computador == 1) || 
			(jogador == 3 && computador == 2)) {
				System.out.println("******Você VENCEU!!!*******");
			}else {
				System.out.println("_____A máquina te derrotou_____");
			}
		}
	}

}
