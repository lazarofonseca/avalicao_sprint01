package br.com.lazaro.entidade;

public class Usuario {

	private String nome;
	public static int acerto;
	public static int erro;

	public Usuario() {
	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getAcerto() {
		return acerto;
	}

	public static void setAcerto(int acerto) {
		Usuario.acerto = acerto;
	}

	public static int getErro() {
		return erro;
	}

	public static void setErro(int erro) {
		Usuario.erro = erro;
	}

}
