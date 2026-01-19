package Util;

public class Banco {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Banco (int numeroConta, String nome, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito (saldoInicial);
	}
	
	public Banco (int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		  this.saldo += deposito;
	}
	
	public void saque(double saque) {
		  this.saldo -= saque + 5;
	}
	
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
	
	
}
 