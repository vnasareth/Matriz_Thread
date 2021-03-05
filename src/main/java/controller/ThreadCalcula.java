package controller;

import java.util.Random;

public class ThreadCalcula extends Thread {
	
//	private int a;
//	private int b;
//	private int c;
//	private int d;
//	private int e;
//	
//	public void ThreadSoma(int a, int b, int c, int d, int e) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//		this.e = e;
//	}
	
	Random random = new Random();
	
	int cont = 1;
	
	@Override
	public void run() {
		calcula();
	}
	
	private void calcula() {
		int resultado = 0;
		String operacao = "";
		
		//3 linhas e 5 colunas
 		int m[][] = new int[3][5];
 		
 		//Linhas
 		for(int j = 0; j <= 2; j++) {
 			int soma = 0;
 			System.out.println("Valores da Linha #" + (j + 1) + ":");
 		
 			//Colunas
	 		for(int i = 0; i <= 4; i++) {
			
	 			m[j][i] = random.nextInt(100);
	 			soma += m[j][i];
	 			
	 			System.out.println("Valor da Coluna #" + (i + 1) + " = " + m[j][i]);
	 			
	 		}
	 		cont += 1;
	 		System.out.println("TID #" + getId() + " Linha #" + cont + "Resultado soma = " + soma);
	 		soma = 0;
	 		System.out.println("");
 		}

	}
	
}
