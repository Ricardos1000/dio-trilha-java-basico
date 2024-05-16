package com.connexaoinformatica.service;

public class ContaTerminal {
		
		private Integer numeroConta;
		private String agencia;
		private String nomeCliente;
		private double saldo = 237.48;
		public double valorDeposito;
		public double valorSaque;
		
		public ContaTerminal() {}
		public ContaTerminal(Integer numeroConta,String agencia,String nomeCliente,double saldo ){
			
			this.numeroConta = numeroConta;
			this.agencia = agencia;
			this.nomeCliente = nomeCliente;
			this.saldo = saldo;
		}
		public Integer getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(Integer numeroConta) {
			this.numeroConta = numeroConta;
		}
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		
		public Double getSaldo() {
			return this.saldo;
		}
		
		public void depositar(double valorDeposito) {
			if(valorDeposito > 0) {
				saldo += valorDeposito;
				System.out.println("Valor do deposito : "+valorDeposito);
				System.out.println("Saldo atual "+saldo);
			}else {
				System.out.println("Valor do deposito tem que ser maior do que zero");
			}
			
		}
		
		public void sacar(double valorSaque) {
			if(saldo > valorSaque) {
				saldo-= valorSaque;
			}else {
				System.out.println("Saldo da conta : "+saldo);
				System.out.println("Valor do Saque : "+valorSaque);
				System.out.println("Saldo insuficiente para o saque ");
						
			}
		}
		
		@Override
		public String toString() {
			return "Dados da ContaTerminal : \n"+
					"Cliente = " +nomeCliente+ "\n"+
					"Agencia = " +agencia + "\n"+
					"Conta = " +numeroConta +"\n"+ 			
					"Saldo Atual = " + saldo + ".";		
		}
		

}
