package br.com.lazaro.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.lazaro.entidade.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.getDefault());
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionários deseja cadastrar? ");
		Integer cont = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < cont; i++) {
			System.out.println("Digite o nome do funcionário: ");
			String nome = sc.nextLine();
			System.out.println("Digite o valor do salário: ");
			Double salario = sc.nextDouble();
			sc.nextLine();
			Funcionario funcionario = new Funcionario(nome, salario);
			funcionario.calculaSalario(funcionario.getSalario());
			listaFuncionarios.add(funcionario);

		}
		System.out.println();
		System.out.println("------------Lista de funcionários e seus dados financeiros-----------");
		System.out.println();
		for (Funcionario lista : listaFuncionarios) {
			System.out.println("Funcionário " + lista.getNome());
			System.out.printf("Salário %.2f :\n", lista.getSalario());
			if(lista.getSalario() <= 2000.0) {
			System.out.printf("Bonus %.2f : \n", lista.getBonus());
			}else if(lista.getSalario() > 2000.0){
				System.out.printf("Desconto %.2f : \n", lista.getBonus());
			}
			
			System.out.printf("Salário Liquido %.2f : \n", lista.getSalarioLiquido());
			System.out.println();

		}

		sc.close();

	}

}
