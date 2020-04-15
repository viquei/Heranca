package Heranca;

public class Gerente extends Funcionario{
	protected int senhaEspecial;
	protected int numeroDeFuncionariosGerenciados;
	
	double getBonificacao() {
		return super.getBonificacao() + 1000.00;
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
