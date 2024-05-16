package com.connexaoinformatica.domain;

import java.util.Scanner;
import com.connexaoinformatica.service.ContaTerminal;

public class AppContaTerminal {

	public static void main(String[] args) {
		//ToDo: conhecer e importar a classe Scanner
		ContaTerminal cc = new ContaTerminal();
		Scanner sc = new Scanner(System.in);
		
		//Exibir as mensagens para o nosso usuário
		System.out.println("-*-*-*-*-*- Bem Vindo ao Bit Bank -*-*-*-*-*-");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		//obter pela classe scanner os valores digitados no terminal
		System.out.println("Por favor digite o número da Agencia : ");
		cc.setAgencia(sc.nextLine());
				
		System.out.println("Por favor digite o número da Conta : ");
		cc.setNumeroConta(sc.nextInt());
			
		System.out.println("Por favor digite o nome do titular da Conta : ");
		cc.setNomeCliente(sc.next());
			
		System.out.println("Por insira o valor do primeiro deposito : ");
		cc.depositar(sc.nextFloat());
		System.out.println();
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		//
		sc.close();
	
		//Exibir a mensagem da conta criada
		System.out.println("Prezado cliente : "+ cc.getNomeCliente());
		System.out.println("Obrigado por abrir sua conta no Banco Bit Bank ");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println();
		//System.out.println("Dados da Conta");
		//System.out.println("Cliente : "+cc.getNomeCliente());
		//System.out.println("Agencia : "+cc.getAgencia());
		//System.out.println("Conta : "+cc.getNumeroConta());
		//System.out.println("Saldo Atual : "+cc.getSaldo());
		
		System.out.println(cc.toString());
		System.out.println("-----------------****----------------");

	}

}
