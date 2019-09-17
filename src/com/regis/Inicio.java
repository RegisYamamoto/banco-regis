package com.regis;

import java.text.ParseException;
import java.util.Scanner;

import com.regis.model.Cliente;

public class Inicio {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Cadastrar Conta Corrente e Cartao de Credito");
		System.out.println("3 - Pagar conta com cartao de credito");
		System.out.println("4 - Pagar conta com conta corrente");
		System.out.println("5 - Depositar em conta corrente");
		System.out.println("6 - Sacar conta corrente");
		System.out.println("7 - Listar clientes (mostrar o perfil do cliente e suas contas)");
		System.out.println("8 - Consultar status das contas de um cliente - pesquisa da conta por cpf do cliente");
		System.out.println("9 - Atualizar limite do cartao de credito");
		System.out.println("10 - Pagar a fatura do cartao de credito");

		int menu = scan.nextInt();
		
		Cliente cliente = new Cliente();

		switch (menu) {
		case 1:
			System.out.println("Digite o primeiro nome");
			String nome = scan.next();
			System.out.println("Digite o sobrenome");
			String sobrenome = scan.next();
			System.out.println("Digite a data de nascimento");
			String dataNascimento = scan.next();
			System.out.println("Digite o email");
			String email = scan.next();
			
			cliente.setNome(nome);
			cliente.setSobrenome(sobrenome);
			cliente.setDataNascimento(dataNascimento);
			cliente.setEmail(email);
			System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso.");
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;
		case 8:

			break;
		case 9:

			break;
		case 10:

			break;
		default:
			break;
		}

	}

}