package Heranca;

import java.util.Scanner;

public class TesterFuncionario {

	public static void main(String[] args) {
		Funcionario programador = new Funcionario();
		Gerente gerenteProduto = new Gerente();
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nome:");
		programador.nome = input.next();
		System.out.println("CPF:");
		programador.cpf = input.next();
		System.out.println("Salario:");
		programador.salario = input.nextDouble();
		
		double bonus = programador.getBonificacao();
		System.out.println("Bonificação:" + bonus);
		
		System.out.println("Nome:");
		gerenteProduto.nome = input.next();
		System.out.println("Cpf:");
		gerenteProduto.cpf = input.next();
		System.out.println("Salario:");
		gerenteProduto.salario = input.nextDouble();
		System.out.println("Senha:");
		gerenteProduto.senhaEspecial = input.nextInt();
		System.out.println("Funcionarios subordinados:");
		gerenteProduto.nome = input.next();
		
		bonus = gerenteProduto.getBonificacao();
		System.out.println("Bonificação:" + bonus);
		System.out.println("Digite sua senha de acesso.");
		int senha = input.nextInt();
		gerenteProduto.autenticaSenha(senha);
	}
}
