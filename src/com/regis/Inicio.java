package com.regis;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.regis.model.CartaoCredito;
import com.regis.model.ContaCorrente;

public class Inicio {

	public static void main(String[] args) throws ParseException {
		menu();
	}
	
	public static void menu() throws ParseException {
		Scanner scan = new Scanner(System.in);
		List<ContaCorrente> listaContaCorrente = new ArrayList<>();
		List<CartaoCredito> listaCartaoCredito = new ArrayList<>();
		
		while(true) {
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Cadastrar Conta Corrente e Cartao de Credito");
		System.out.println("2 - Pagar conta com cartao de credito");
		System.out.println("3 - Pagar conta com conta corrente");
		System.out.println("4 - Depositar em conta corrente");
		System.out.println("5 - Sacar conta corrente");
		System.out.println("6 - Listar clientes (mostrar o perfil do cliente e suas contas)");
		System.out.println("7 - Consultar status das contas de um cliente - pesquisa da conta por cpf do cliente");
		System.out.println("8 - Atualizar limite do cartao de credito");
		System.out.println("9 - Pagar a fatura do cartao de credito");
		
		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			// Cadastrar Conta Corrente e Cartao de Credito
			break;
		case 2:
			// Pagar conta com cartao de credito
			break;
		case 3:
			// Pagar conta com conta corrente
			break;
		case 4:
			// Depositar em conta corrente
			break;
		case 5:
			// Sacar conta corrente
			break;
		case 6:
			// Listar clientes (mostrar o perfil do cliente e suas contas)
			break;
		case 7:
			// Consultar status das contas de um cliente - pesquisa da conta por cpf do cliente
			break;
		case 8:
			// Atualizar limite do cartao de credito
			break;
		case 9:
			// Pagar a fatura do cartao de credito
			break;
		default:
			break;
		}
	}
	}

}