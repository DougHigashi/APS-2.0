import java.util.Scanner;

public class Main {
	
	protected static int choice;
	
	public static void main(String[] args) {
		
		day();

		
	}
	
	public static void day() {
		Banho banho = new Banho();
		Dentes dentes = new Dentes();
		Caf� cafe = new Caf�();
		Carro carro = new Carro();
		Onibus onibus = new Onibus();
		Trabalho trabalho = new Trabalho();
		FimExpediente fim = new FimExpediente();
		Intervalo intervalo = new Intervalo();
		Almo�o almo�o = new Almo�o();
		Lou�a lou�a = new Lou�a();
		
		banho.question();
		answer();
		if(choice == 1) {banho.sim();}
		else if(choice == 2) {banho.nao();}
		dentes.question();
		answer();
		if(choice == 1) {dentes.sim();}
		else if(choice ==2) {dentes.nao();}
		cafe.question();
		answer();
		if(choice == 1) {cafe.sim();}
		else if(choice == 2) {cafe.nao();}
		dentes.question();
		answer();
		if(choice == 1) {dentes.sim();}
		else if(choice == 2) {dentes.nao();}
		carro.question();
		answer();
		if(choice == 1) {carro.sim();}
		else if(choice == 2) {
			carro.nao();
			onibus.question();
			answer();
			if(choice == 1) {onibus.sim();}
			else if(choice ==2) {onibus.nao();}
		}
		intervalo.question();
		food();
		if(choice == 1) {
			System.out.println("Voc� pediu um combo pra viagem");
			System.out.println("Quer levar em uma sacola pl�stica?");
			answer();
			if(choice == 1) {System.out.println("Voc� levou seu pedido em uma sacola...");}
			else if(choice == 2) {System.out.println("Voc� n�o levou em uma sacola pl�stica");}
		} else if(choice == 2) {
			System.out.println("Voc� pediu um sandu�che caseiro do Tio");
			System.out.println("Quer levar em uma sacola pl�stica?");
			answer();
			if(choice == 1) {System.out.println("Voc� levou seu pedido em uma sacola...");}
			else if(choice == 2) {System.out.println("Voc� n�o levou em uma sacola pl�stica");}
		}else if(choice == 3) {
			System.out.println("Voc� toma um caf� e come um p�o de queijo na cafeteria...");
		}
		trabalho.question();
		answer();
		if(choice == 1) {trabalho.sim();}
		else if(choice == 2) {trabalho.nao();}
		almo�o.question();
		answer();
		if(choice == 1 ) {
			almo�o.sim();
			food();
			if(choice == 1) {System.out.println("Voc� vai almo�ar em um restaurante");}
			else if(choice == 2) {System.out.println("Voc� pede comida por delivery");}
		}
		else if(choice == 2) {almo�o.nao();}
		fim.question();
		answer();
		if(choice == 1) {fim.sim();}
		else if(choice == 2) {fim.nao();}
		lou�a.question();
		answer();
		if(choice == 1) {lou�a.sim();}
		else if(choice == 2) {lou�a.nao();}
		System.out.println("O dia terminou");
		banho.question();
		answer();
		if(choice == 1) {banho.sim();}
		else if(choice == 2) {banho.nao();}
		System.out.println("Voc� decide ir dormir...");
		
		
		
		
		
		
		
		
	}
	public static void answer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("|| 1 - Sim   2 - N�o ||");
		System.out.println("===================");
		choice = scanner.nextInt();
	}
	public static void food() {
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		
	}

}
