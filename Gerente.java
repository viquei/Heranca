package Heranca;

public class Gerente extends Funcionario{
	protected int senhaEspecial;
	private int numeroDeFuncionariosGerenciados;
	
	public double getBonificacao() {
		System.out.println(0.1*super.salario + 1000.00);
		return 0.1*super.salario + 1000.00;
	}

	public int getSenhaEspecial() {
		return senhaEspecial;
	}

	public void setSenhaEspecial(int senhaEspecial) {
		this.senhaEspecial = senhaEspecial;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	void autenticaSenha(int senha) {
		if (senha==this.senhaEspecial) {
			System.out.println("Acesso liberado.");
		}
		else {
			System.out.println("Acesso negado");
		} 
			
	}
}
