package br.com.lazaro.entidade;

public class Funcionario {

	private String nome;
	private Double salario;
	private Double bonus;
	private Double salarioLiquido;

	public Funcionario() {
	}

	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(Double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public Double calculaSalario(Double salario) {
		this.salario = salario;
		if (this.salario > 0 && this.salario <= 1000.0) {
			
			this.bonus = (this.salario * 0.20);

			return this.salarioLiquido = (this.bonus + salario);
		} else if (this.salario > 1000.0 && this.salario <= 2000.0) {

			this.bonus = (salario * 0.10);

			return this.salarioLiquido = (this.bonus + salario);
		} else{
			this.salario = salario;
			this.bonus = salario * 0.10;
			return this.salarioLiquido = (this.salario - (this.salario * 0.10));
		}
	}
}
