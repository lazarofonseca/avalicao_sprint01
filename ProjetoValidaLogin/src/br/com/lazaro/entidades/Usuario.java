package br.com.lazaro.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	private String senha;

	//List<Usuario> usuarios = new ArrayList<Usuario>();

	public Usuario() {
	}

	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/*
	 * public List<Usuario> getUsuarios() { return usuarios; }
	 */

}
