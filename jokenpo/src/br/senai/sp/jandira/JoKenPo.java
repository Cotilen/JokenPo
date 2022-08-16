package br.senai.sp.jandira;

 import java.util.Scanner;
public class JoKenPo {
	

	public static void main(String[] args) {
		int jogador,computador;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("******JoKenpô******\n");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("\nEscolha seu movimento:");
		
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
		
		if (jogador == computador) {
			System.out.println("Empate");
		} else {
			if((jogador == 1 && computador == 3) ||
			(jogador == 2 && computador == 1) || 
			(jogador == 3 && computador == 2)) {
				System.out.println("******Você venceu*******");
			}else {
				System.out.println("§§§§§ A máquina te derrotou! §§§§§");
			}
		}
	}

}
